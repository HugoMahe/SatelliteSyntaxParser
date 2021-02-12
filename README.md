# Projet Satellites & Balises
**Hugo MAHE** & **Gurvan LORANS-CANO**

## Introduction
Pour l'�laboration de ce projet qui consiste � la correction et � l'�volution du code nous avons impl�ment� diff�rentes fonctionnalit�s au sein des sources distribu�es au d�but du projet.

## Restructuration du code
Afin de pouvoir s'y retrouver plus facilement dans le projet, nous avons d�cid� de renommer les classes pour respecter une certaine nomenclature. Ainsi les classes de D�placement sont pr�fix�es par **_Depl_** et les classes d'�tats sont pr�fix�es par **_State_**. De plus nous avons restructur� l'arborescence par package afin de s'y retrouver plus facilement. De ce fait, nous avons les packages suivant : 
| Nom | Utilisation |
|--|--|
| deplacement | stocke la classe Deplacement et ses sous-classes |
| deplacement.balise | stocke la classe DeplBalise ainsi que ses sous-classes |
| event | Stocke tous les diff�rents �v�nements compris au sein du syst�me |
| listener | Va stocker les diff�rents listener qui peuvent �tre utilis�s dans le syst�me |
| model | Va stocker les classes "model" : e.g Satellite, Balise, ElementMobile, ... 
| simulation | Contient les classes utilis�es pour la simulation eg. les �l�ments graphique et la classe simulation | 
| state | Contient tous les diff�rents �tats utilis�s dans le syst�me | 


## Graphique

### GrDescription
Dans un soucis de lisibilit� il a �t� d�cid� d'enrichir l'interface avec des �l�ments facilitant le "d�bogage" du programme, des �l�ments tel qu'un label ou l'affichage de certains attributs.  

Un objet **_ElementMobile_** est donc associ� � une nouvelle classe nomm�e **_GrDescription_**, cette classe � pour but de fournir des �l�ments graphique � ajouter sur les **_ElementsMobiles_**, il a �t� d�cid� que "par defaut" un **_ElementMobile_** pourrait avoir une description g�n�rique compos�e d'un _Label_ cela permettait d'�viter de la "redondance" de code entre la description d'un satellite et d'une balise. 

```java
public void ajoutDescription(String label, ElementMobile element) {
		// AJOUT DU LABLE GENERIQUE
		this.description = new GrDescription();
		this.description.label = new GString(label);
		this.description.label.setDimension(new Dimension(500, 500));
		Point p = new Point(12, 60);
		this.description.label.setPosition(p);
		this.description.label.setFont(new Font("Arial", 1, 20));
		this.addElement(this.description.label);
	}
```
Cette m�thode **_ajoutDescription_** est surcharg�e dans les classes �nonc�es plus haut, avec leurs sp�cificit�s, par exemple dans le cas d'un **_GrBalise_** sur un fond bleu il fallait choisir un texte blanc mais ce n'est pas possible pour le satellite qui est lui m�me d�j� sur un fond blanc. 

Un point qui peut �tre am�lior� , est qu'une balise avait d�s le d�but une barre de chargement (associ� � sa m�moire remplie ou non) mais pas un satellite. Il a �t� d�cid� de r�pliquer ce comportement pour le satellite. Cette d�cision est arriv�e tardivement sur le projet et donc la barre de chargement n'est pas g�n�rique � l��l�ment mobile, on peut donc observer cette fois une redondance dans le code. 

### GrBarreChargement
La barre de chargement dispose d'un comportement relativement simple, � chaque �v�nement "positionChanged" l'objet GrElementMobile ex�cute la m�thode refresh, cette m�thode refresh vient appliquer cette m�me m�thode sur la GrDescription et donc enfin sur la barreDeChargement. 

A chaque refresh la barre de chargement vient regarder le pourcentage rempli de la m�moire et d�termine une dimension � adopter �quivalent � son remplissage. 

La barre de chargement dispose du code couleur suivant: 

| Couleur| Description |
|--|--|
|Bleu| Partie non remplie de la m�moire |
|Orange| Partie  remplie de la m�moire |
|Verte| La m�moire est enti�rement remplie  |

### Diagramme de classe de GrDescription
![Diagramme GrDescription ](./diagrammeGrDescription.png)

Si il ne s'affiche pas merci de consulter l'archive.. 

## Correction des concepts

### Gestion des �tats (State)
Certaines balises ne redescendaient pas suite � leurs synchronisation. Le bug a �t� rep�r� gr�ce au debug possible par l'interface graphique. Ainsi, nous avons pu rep�r� que ceci �tait d� � un probl�me de gestion d'�tat. Les balises continuait de collecter des donn�es lors de la plong�e.
Suite � ce constat, nous avons d�cid� de mettre en place une notion de state au lieu d'un attribut pour respecter au mieux l'OCP ainsi on peut facilement modifier le comportement d'une balise sans avoir � modifier/ajouter des attributs au sein de la classe balise. Nous avons donc 2 �tats : 
| Nom | Utilisation |
|--|--|
| StateCollect | Etat dans lequel la balise va r�colter ses donn�es |
| StateSynchronisation | Etat dans lequel la balise va remonter � la surface, attendre sa synchronisation, se synchroniser puis replonger � la profondeur � laquelle elle �tait avant sa remont�e |

StateSynchronisation va ainsi stocker le d�placement initial et la profondeur de la balise pour les r�-affecter � sa sortie

### DeplSynchronisation ne se d�place pas
La classe DeplSynchronisation ne concernait en rien un d�placement. L'objectif de cette classe �tait la gestion de la synchronisation. Ceci pose un probl�me de conception. Nous avons donc d�cid� de supprim� cette classe et d'impl�menter la classe DeplStandBy pour la remplacer.
En effet lors de la synchronisation une balise ne doit plus se d�placer. De plus le DeplStandBy �tait une notion du cahier des charges qui manquait � l'archive original. 
La gestion de la synchronisation quand � elle a �t� d�port�e dans la classe StateSynchronisation car ses actions concernaient le comportement de la balise ce qui par d�finition correspond � un �tat.
 
## Un Manager trop d�pendant

Un autre soucis majeur de la conception faites dans l'archive original concernait le DIP non respect� au sein du Manager. En effet, celui-ci se reposait sur des �l�ments **concrets** tel que _Balise_ et _Satellite_ au lieu de se reposer sur des �l�ments **abstraits**. La correction a donc �t� �labor�e en 2 temps.

### Gestion du tick
Le manager se reposant sur les 2 classes concr�te du syst�me nous avons corrig� ceci pour le tick. Ainsi nous avons supprim� les listes concr�tes pour les remplacer par des listes abstraites. 

Ainsi : 
```java
ArrayList<Satelitte> sats = new ArrayList<Satelitte>();
ArrayList<Balise> bals = new ArrayList<Balise>();
```
devient 
```java
Set<ElementMobile> elMobs = new HashSet<>();
```

et les m�thodes associ�es � l'ajout d'objet et de leurs ticks passe de : 
```java
public void addBalise(Balise bal) {
	bals.add(bal);
	bal.setManager(this);
}

public void addSatellite(Satelitte sat) {
	this.sats.add(sat);
	sat.setManager(this);
}

public void tick() {
	for (Balise b : this.bals) {
		b.tick();
	}
	for (Satelitte s : this.sats) {
		s.tick();
	}
}
```
� simplement : 
```java
public void addElement(ElementMobile elMob) {
	this.elMobs.add(elMob);
	elMob.setManager(this);
}

public void tick() {
	for (ElementMobile elMob : this.elMobs) {
		elMob.tick();
	}
}
```

On voit clairement ici qu'en plus de respecter le DIP, on simplifie et on r�duit le code. Car nous agissons exactement de la m�me mani�re quelque soit l'�l�ment concret pour le tick �tant donn� que cette m�thode est incluse dans l'abstraction ElementMobile.

### Un abonnement trop concret
La seconde partie du Manager concernait la gestion de l'abonnement. Pour info nous avions les m�thodes suivantes : 
```java
public void baliseReadyForSynchro(Balise b) {
	for (Satelitte s : this.sats) {
		s.registerListener(SatelitteMoved.class, b);
	}
}
public void baliseSynchroDone(Balise b) {
	for (Satelitte s : this.sats) {
		s.unregisterListener(SatelitteMoved.class, b);
	}
}
``` 

On voit ici qu'on utilise des �l�ments concrets. Ceci pose donc probl�me au niveau du **DIP**. Nous devrions avoir des m�thodes qui se reposent uniquement sur **ElementMobile**, la classe abstraite.

Afin de pouvoir se reposer sur cette abstraction nous mettons donc en place un Double-Dispatch. Pour ce faire, dans ElementMobile nous d�finissons 2 m�thodes qui sont : 

#### Modification du mod�le
![Diagramme ](./diagramme-classe-double-dispatch.png)
#### S�quence d'appel de m�thode
*Pour une balise s'abonnant aux d�placements d'un satellite*
```mermaid
sequenceDiagram
ElementMobile(Balise) ->> Manager: checkSynchronisation(element)
Manager ->> ElementMobile(Satellite): checkReceiverSynchro(element: ElementMobile)
ElementMobile(Satellite) ->> ElementMobile(Balise): checkSatelliteSynchro(satellite: Satellite)
Note right of ElementMobile(Satellite): L'appel de la m�thode checkReceiverSynchro<br/> se fait pour tous les �l�ments mobiles enregistr� dans le Manager.
ElementMobile(Balise) ->> ElementMobile(Balise): satellite.registerListener(SatelliteMoved.class, this)
ElementMobile(Balise) -->> Manager: 
```

*Si l'�l�ment secondaire analys� �tait du type Balise (liaison Balise-Balise)* 
```mermaid
sequenceDiagram
ElementMobile(Balise) ->> Manager: checkSynchronisation(element)
Manager ->> ElementMobile(Balise2): checkReceiverSynchro(element: ElementMobile)
ElementMobile(Balise2) -->> Manager: 
```

Comme on peut le voir dans le diagramme ci-dessus le double dispatch n'a aucun impact sur les liaisons qui n'ont pas lieu d'�tre. En effet la balise n'�tant pas un receveur possible, sa m�thode `checkReceiverSynchro` n'est pas surcharg� et n'a donc aucun effet sur le programme (m�thode vide)

#### Explications textuelles
```java
	public void checkReceiverSynchro(ElementMobile other) {}

	public void checkSatelliteSynchro(Satelitte satelitte) {}
```

Ici `checkReceiverSynchro` sera la m�thode non d�terministe. Ainsi quand on l'appelle on aura aucune id�e de l'�l�ment concret  qui sera utilis� pour appel� la m�thode. De plus nous aurons aucun moyen de savoir le type concret du param�tre other. 

Nous avons donc 2 inconnues. Pour d�terminer une des 2 nous allons pouvoir surcharger la m�thode `checkReceiverSynchro` dans Satellite. Ainsi dans le code sur la m�thode surcharg�e nous saurons que le `this` correspond � une instance de Satellite. 

Dans le code de cette surcharge nous appellerons donc la m�thode `checkSatelliteSynchro`  en passant this en param�tre.

Ainsi nous aurons qu'� surcharger la m�thode `checkSatelliteSynchro` pour indique aux classes concr�tes qui doivent �mettre aux satellites. 

De ce fait, dans `Balise` nous surchargeons donc `checkSatelliteSynchro`

Ainsi dans le manager nous n'aurons qu'� impl�menter la m�thode suivante : 

```java
public void checkSynchronisation(ElementMobile element) {
	for (ElementMobile elMob : this.elMobs) {
		elMob.checkReceiverSynchro(element);
	}
}
```
Comme on peut le voir le param�tre est abstrait et le type de la liste parcourue �galement.

A noter que pour `unregister` un listener, nous avons utilis� exactement le m�me m�canisme mais avec des m�thodes ayant pour suffixe : `SynchroDone`

## BaseNavale 
Le pattern que l'on vient de d�montrer avec ce double dispatch � �t� �galement appliqu� pour la liaison Satellite vers BaseNavale (repr�sent�e en un carr� rouge dans l'interface) 

C'est une premi�re it�ration de cette m�thode de synchronisation et nous rencontrons encore quelques bugs sur son impl�mentation. 

La sp�cificit� pour la baseNavale est que cette derni�re doit connaitre les satellites proches d'elle et qui sont en �tat de **_StateSynchroBase_**, c'est le satellite qui envoi au manager une demande de synchronisation via la m�thode checkSynchro(Satellite), le satellite devient alors en attente d'un �v�nement qui est **_WhenBaseNavaleAProximite_** et lorsque ce signale est re�u on proc�de alors au "vidage" de la m�moire du satellite et on passe � l'�tat de satellite suivant qui correspond � son �tat initial : **_StateCollectSatellite_** _(StateSatelliteCollect n'�tant quitt� que par un retour true de la m�thode memoryFull())_ . 

## Bug connus et non corrig�s
Le programme n'est pas exempt� de bug, cette liste permet d'�voquer ce que nous connaissons ainsi que nos pistes de r�solution...
| Reference | Description du bug | Piste de r�solution |
|--|--|--|
|BaseNavale01| La base navale vide l'ensemble des satellite remplis qu'ils soient � port�e ou non | Envoyer le satellite recevant l��v�nement de synchronisation et tester si c'est bien le bon satellite � port�e que l'on vide
|SatelliteBalise01| La balise peut parfois envoyer d'avantage de donn�es que le satellite peut accepter (elle se vide enti�rement peut importe si il y a la place ou non sur le satellite) | Rajouter une condition de m�moire pleine qui permettrait de quitter l'�tat de collecte directement pendant l'envoi de donn�es (C�t� satellite et Balise) 

