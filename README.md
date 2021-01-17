# Fragments and Navigation

## Topics Covered
* Creating and Adding a Fragment
* Navigation Component (Navigation Graph)
* Back Stacks Manipulation
* NavController
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



