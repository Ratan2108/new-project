let input = document.querySelector('.input_text');
let main = document.querySelector('#name');
let temp = document.querySelector('.temp');
let desc = document.querySelector('.desc');
let clouds = document.querySelector('.clouds');
let button= document.querySelector('.submit');
button.addEventListener('click', function(name){

fetch('https://api.openweathermap.org/data/2.5/weather?q='+input.value+'&appid=3b1e2c476821e8235b37603750a3be5c')
.then(response => response.json())
.then(data => {
  let tempValue = data['main']['temp'];
  let nameValue = data['name'];
  let descValue = data['weather'][0]['description'];

  main.innerHTML = nameValue;
  desc.innerHTML = "Desc - "+descValue;
  temp.innerHTML = "Temp - "+tempValue;
  input.value ="";

})

.catch(err => alert("Wrong city name!"));
})