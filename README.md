# Structure du projet
	- Legacy : 1 projet unique qui contiens les routes suivantes:
		- /Catalog : Affiche tous les produits par categorie pour la page d'acceuil sous cette forme :
		```
			[
				{
					"id": 1,
					"name": "nomCategorie1",
					"contents": [
						{
							"id": 1,
							"name": "Produit1",
							"photoURL": "urlPhoto",
							"priceBase": 19.99,
							"promoDiscount": 0.00,
							"description": "...."
						},
					....
					]
				}
			]
		```

	- /Buy : Route POST qui prends un id de produit, cree un panier en base et reference les produits. Exemple de panier pousse en base
		```
		{
			"panId": "786294172687312983", // AutoGen
			"contents": [1, 23, 54],
			"payed": false
		}
		```
		Si on lui passe un id de panier, alors il ajoutera l'id de produit en base. Ajouter plusieurs produits correspond a ajouter plusieurs id, on va au plus simple.

	- /Basket: Route POST qui prends un panId et renvoie tous les details des produits ainsi que le cout total
		```
		{
			"panId": "786294172687312983", // AutoGen
			"contents": [
				{
					"id": 1,
					"name": "Produit 1",
					....
				},
				....
			]
		}
		```
# 2 - Structure de la base de donnees

Representation d'un produit en base:

```
{
	"id": 1,
	"name": "Produit1",
	"photoURL": "urlPhoto",
	"priceBase": 19.99,
	"promoDiscount": 0.00,
	"description": "...."
}
```

Representation d'une categorie en base:
```
{
	"id": 1,
	"name": "nomCategorie1",
	"contents": [1, 2, 3, 4]
}
```

Representation d'un panier en base:
```
{
	"panId": "786294172687312983", // AutoGen
	"contents": [1, 23, 54],
	"payed": false
}
```
