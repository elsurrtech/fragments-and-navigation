# Fragments and Navigation

## Topics Covered
* Creating and Adding a Fragment
* Navigation Component (Navigation Graph)
* Conditional Navigation
* Back Stacks Manipulation
* NavController with ActionBar
* SafeArgs (Safe Arguments)
* Explicit and Implicit Intents (share you quiz results on other apps like whatsapp etc. )
* Pass data between fragments
* Animation between fragments**
* BONUS 1: Add a menu
* BONUS 2: Add a navigation Dwawer

** : not yet fully updated

---

## 1. Creating and Adding a Fragment

### 1.1 Create a Fragment

Create a Fragment by <strong> New - Fragment - Fragment(Blank) </strong>

![](images/1_1.png)

### 1.2 Add a Fragment

```
override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                         savedInstanceState: Bundle?): View? {
   val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)
   return binding.root
}
```
---

## 2. Navigation Graph

### 2.1 Add dependencies to Gradle

Add this to Gradle - Project
```
buildscript {
    ext {
        version_navigation = '1.0.0'
    }
```
then,
Add this to Gradle - App
```
dependencies {
    implementation "android.arch.navigation:navigation-fragment-ktx:$version_navigation"     
    implementation "android.arch.navigation:navigation-ui-ktx:$version_navigation"
}
```
### 2.2 Add navigation.xml (Navigation Graph)

![](images/2_2.png)

### 2.3 Add NavHostFragment in Activity Layout
```
<fragment
   android:id="@+id/myNavHostFragment"
   android:name="androidx.navigation.fragment.NavHostFragment"
   android:layout_width="match_parent"
   android:layout_height="match_parent"
   app:navGraph="@navigation/navigation"
   app:defaultNavHost="true"
   />
```

### 2.4 Adding Fragments to Navigation Graph and Connecting them

![](images/2_4.png)

### 2.5 Navigation by OnClickListener

```
binding.playButton.setOnClickListener { view: View ->
        view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
}
```

---

## 3. Conditional Navigation

### 3.1 onClick Navigation based on actions(in the navigation graph) 
```
view.findNavController()
   .navigate(R.id.action_gameFragment_to_gameWonFragment)
```

---

## 4. Back Stack Manipulation

###4.1 Add BackStac by PopTo

![](images/4_2.png)

---

## 5. NavController with ActionBar Connection

### 5.1 Link the NavController to the ActionBar with NavigationUI.setupWithNavController
```
val navController = this.findNavController(R.id.myNavHostFragment)
```
Link the NavController to our ActionBar.
```
NavigationUI.setupActionBarWithNavController(this, navController)
```

### 5.2 Override the onSupportNavigateUp method from the activity and call navigateUp in nav controller

```
override fun onSupportNavigateUp(): Boolean {
   val navController = this.findNavController(R.id.myNavHostFragment)
   return navController.navigateUp()
}
```

### 5.3 


