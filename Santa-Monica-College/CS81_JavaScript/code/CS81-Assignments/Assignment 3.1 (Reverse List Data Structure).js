function reverseList(list) {
  // check if type is string or number
  var sum = 0;
  if (typeof list.value === "string"){
    sum = "";
  }

  // turn list into arr and get sum of the original
  // order while doing so
  var arr = [];
  for (var node = list; node; node = node.rest) {
    arr.push(node.value);
    sum += node.value;
    if (node.rest === null) {
      break;
    }
  }
  
  // turn arr into reversed list
  var reversedList = createList(arr);
  
  // attach sum to first list item
  reversedList.total = sum;
  
  return reversedList;
}

function createList(arr) {
  var list = null;
  for (var i = 0; i < arr.length; i++) {
     list = {
       value: arr[i],
       rest: list,
     }
  }
  return list;
}

// test case 1
var list1 = {
  value: 1,
  rest: {
    value: 2,
    rest: {
      value: 3,
      rest: null
    }
  }
}

// test case 2
var list2 = {
  value: "a",
  rest: {
    value: "b",
    rest: {
      value: "c",
      rest: null
    }
  }
}

console.log(reverseList(list1));
console.log(reverseList(list2));