# AndroidFragmentInViewPagerLifeCycle

### FragmentStatePagerAdapter vs FragmentPagerAdapter
the different is onDestroy
https://stackoverflow.com/a/47522999/5381331

### Fragment visible
https://stackoverflow.com/a/42019934/5381331


## Full Lifecycle (OFFSCREEN = 4)

#### Go to Fragment 1
```
Fragment1: setUserVisibleHint false - false
Fragment2: setUserVisibleHint false - false
Fragment3: setUserVisibleHint false - false
Fragment4: setUserVisibleHint false - false
Fragment1: setUserVisibleHint true - false
Fragment1: onCreateView
Fragment1: onStart
Fragment1: onResume
Fragment2: onCreateView
Fragment3: onCreateView
Fragment4: onCreateView
Fragment2: onStart
Fragment2: onResume
Fragment3: onStart
Fragment3: onResume
Fragment4: onStart
Fragment4: onResume
```

#### Go to Fragment2
```
Fragment1: setUserVisibleHint false - true
Fragment2: setUserVisibleHint true - true
```

#### Go to Fragment3
```
Fragment2: setUserVisibleHint false - true
Fragment3: setUserVisibleHint true - true
```

#### Go to Fragment4
```
Fragment3: setUserVisibleHint false - true
Fragment4: setUserVisibleHint true - true
```

#### Go to another activity (Footer Activity)
```
Fragment1: onStop
Fragment2: onStop
Fragment3: onStop
Fragment4: onStop
```
#### Go back from another activity
```
Fragment1: onStart
Fragment2: onStart
Fragment3: onStart
Fragment4: onStart
Fragment1: onResume
Fragment2: onResume
Fragment3: onResume
Fragment4: onResume
```
#### Go to background
```
Fragment1: onStop
Fragment2: onStop
Fragment3: onStop
Fragment4: onStop
```
#### Go to foreground
```
Fragment1: onStart
Fragment2: onStart
Fragment3: onStart
Fragment4: onStart
Fragment1: onResume
Fragment2: onResume
Fragment3: onResume
Fragment4: onResume
```

