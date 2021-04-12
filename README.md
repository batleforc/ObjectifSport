# Objectif Sportif

## Les norme

- Langue : Variable en anglais + commentaire en franglais (technique en anglais + explication en français)
- Norme : CamelCase
- Les fichier DAO (data access Object) sont préfixer par le mot clef Dao, les modèle ne le sont pas.
-Organisation :
  - Les fichier model sont situer dans le dossier model
  - Les fichier helper (fonction nécessaire a travers l'application) sont dans le dossier helper
  - Les fichier écran (handler d'un écran) sont dans le dossier screen
  - Les fichier handler sont dans le dossier handler (permet de gérer certaine action)
- Git : Les commit sont sous le format [Action] commentaire
- L'application est versionner via des tag en semversion
- Les branch sont Master ou Développe ou Feature/{ID FEATURE}
- La partie intégration continue utilise le script de "vgaidarji/android-github-actions-build@v1.0.1"

## Device cible

- Samsung Galaxy S9+ sous android 10
- Tablette Émulateur sous android 10

## Bug connue

- Réinstallation récurrente d'android studio (découverte ce soir que j'ai installer une version nightly ...)
- Conflict entre la version github et gitea (La version gitea est censée push sur github via la clef ssh)
- Problême de temps : ayant confiance dans ma compréhension d'android j'ai cru avoir le temps de travailler petit a petit chaque soir sur la solution. Voyant l'échance ce rapprocher et les autre projet a rendre plus tôt arriver j'ai eu la tres mauvaise idée de les travailler en priorité.

## Fonctionnalités  manquante

- Suivis des activité en temps réel
- Formulaire de création de sport
- Formulaire de création d'objectif
- Formulaire d'ajout d'activité déja effectué
- Menu pour le changement des écran
