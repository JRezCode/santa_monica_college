# C/C++ Basics


## Syntax for Pointers
### declare/initiate (pointer and pointer to pointer)
```
dtype initialValue = value;
dtype *ptValue, **ptPtValue;
ptValue = &initialValue;
ptPtValue = &ptValue;
```
### copy content (pointer dereferencing)
```
dtype oldValue = *ptValue
```
### next/previous value (pointer arithmetic)
```
ptValue++; ptValue–;
```

## Syntax for Arrays
### declare/initiate (array)
```
dtype var[size];			//declaring array
dtype[] var = {a,b,c};		//where a,b,c are literals
dtype mul[dim1][dim2];		//declaring a multidimensional array
dtype[][]mul[dim1][dim2];		//declaring a multidimensional array
```
## Control Structures
### looping (for loop)
```
for (int i = 0; i < val; i++){
//body
}
```

## Data Structures
### elemental reordering (an array of pointers to pointers)
```
ptValues[a] = &values[val]
ptPtValues[m] = &ptValues[a]
//where ptValues points to a starting point and **ptPtValues can change that
cout << **ptPtValues[i] << endl;
```

### Example 1
```
char letters[3];
letters[0] = ‘C’; letters[1] = ‘B’; letters[2] = ‘A’;
char * ptLetters[3];
for (int i = 0; i < 3; i++)
    ptLetters[i] = &letters[i];
char ** ptPtLetters[3];
ptPtLetters[0] = &ptLetters[2]; ptPtLetters[1] = &ptLetters[1]; ptPtLetters[2] = &ptLetters[0];
//**ptPtLetters can be used to dereference the original array in reverse order
```


