# TP1 - Application Compteur Android (Kotlin)

Cette application Android est un travail pratique (TP1) réalisé avec Android Studio et Kotlin. Elle implémente un compteur interactif simple permettant d'incrémenter et de réinitialiser une valeur numérique, tout en gérant la persistance des données lors des changements de configuration (comme la rotation de l'écran).

---

## 🚀 Fonctionnalités

- **Incrémentation** : Appui sur le bouton *Incrémenter* pour augmenter la valeur du compteur de +1.
- **Réinitialisation** : Appui sur le bouton *Réinitialiser* pour remettre le compteur à 0.
- **Sauvegarde de l'état** : Utilisation de `onSaveInstanceState` pour préserver le compteur lors de la rotation de l'écran de l'appareil.

---

## 🛠️ Structure du projet

- **Code Kotlin** : [`app/src/main/java/com/example/tp1/MainActivity.kt`](app/src/main/java/com/example/tp1/MainActivity.kt)
  - Gestion des événements de clics (`setOnClickListener`).
  - Liaison des vues XML via `findViewById`.
  - Gestion du cycle de vie et sauvegarde de l'état (`onSaveInstanceState` / `savedInstanceState`).

- **Interface Graphique (XML)** : [`app/src/main/res/layout/activity_main.xml`](app/src/main/res/layout/activity_main.xml)
  - Disposition verticale en `LinearLayout`.
  - `TextView` pour l'affichage de la valeur.
  - `Button` pour l'incrémentation et la réinitialisation.

---

## 📋 Prérequis & Installation

1. **Android Studio** (Version récente recommandée).
2. **JDK 17+** et **SDK Android**.
3. Cloner ou télécharger le dépôt, puis l'ouvrir dans Android Studio.
4. Lancer le projet sur un émulateur ou un appareil Android physique via le bouton **Run (Shift + F10)**.

---

## 💻 Exemple de Code

```kotlin
// Incrémentation et mise à jour de l'affichage
btnIncrement.setOnClickListener {
    compteur++
    mettreAJourAffichage()
}

// Sauvegarde de l'état lors des rotations
override fun onSaveInstanceState(outState: Bundle) {
    super.onSaveInstanceState(outState)
    outState.putInt(KEY_COMPTEUR, compteur)
}
```
