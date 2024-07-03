//Script 1 
//This script is used to gather the HTML canvas elements into an array and
//activates the radio buttons on top for setting canvas sizes.

var canvas = [];
canvas = Array.from(document.getElementsByTagName("canvas"))

  function Init () {
    var radio_small = document.getElementById ("S");
    var radio_larger = document.getElementById ("L");
    radio_small.addEventListener ("RadioStateChange", OnRadioStateChange, false);
    radio_larger.addEventListener ("RadioStateChange", OnRadioStateChange, false);
  }

  function OnRadioStateChange (event) {
    var radio = event.target;
    if(radio.checked){
    if(radio.value=="Larger")
      canvas.forEach(function(c) { setCanvasSizeLarge(c) });
    else if(radio.value=="Small")
      canvas.forEach(function(c) { setCanvasSizeSmall(c) });
    else
        alert("Unhandled error");
    }
    redraw();
    }

  window.addEventListener("load",Init,false);