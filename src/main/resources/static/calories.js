
fetch("http://localhost:8080/mainWeather").then(response => response.json())
  .then(data =>  document.getElementById('weatherTemp').innerHTML=`Temperatura:<b> ${data.mainTemp} °C</b>`);

 fetch("http://localhost:8080/Open").then(response => response.json())
  .then(data =>  document.getElementById('pressure').innerHTML=`Ciśnienie: <b>${data.main.pressure}hPa</b>`);

fetch("http://localhost:8080/mainWeather").then(response => response.json())
  .then(data =>  document.getElementById('windspeed').innerHTML=`Prędkość wiatru: <b>${data.windSpeed}m/s</b>`);

fetch("http://localhost:8080/Open").then(response => response.json())
  .then(data =>  document.getElementById('humidity').innerHTML=`Wilgotność powietrza: <b>${data.main.humidity}%</b>`);






fetch("http://localhost:8080/mainWeather")
  .then(response => response.json())
  .then(data =>  document.getElementById('icon').innerHTML=`<img src="http://openweathermap.org/img/wn/${data.icon}@2x.png"/>`);


document.getElementById('day').innerHTML=` <b>${myFunction()}</b>`;

document.getElementById('date').innerHTML=` <b>${myFunction2()}</b>`;

function myFunction2(){
date = new Date();
year = date.getFullYear();
month = date.getMonth() + 1;
day = date.getDate();

 switch(month){
    case 1: month = "Styczeń"; break;
    case 2: month = "Luty"; break;
    case 3: month = "Marzec"; break;
    case 4: month = "Kwiecień"; break;
    case 5: month = "Maj"; break;
    case 6: month = "Czerwiec"; break;
    case 7: month = "Lipiec"; break;
    case 8: month = "Sierpień"; break;
    case 9: month = "Wrzesień"; break;
    case 10: month = "Październik"; break;
    case 11: month = "Listopad"; break;
    case 12: month = "Grudzień"; break;
  }

var text =day + " "+month+" " + year;
return text;

}

function myFunction() {
date = new Date();
var dzienTygodnia = date.getDay();
  switch(dzienTygodnia){
    case 0: dzienTygodnia = "niedziela"; break;
    case 1: dzienTygodnia = "poniedziałek"; break;
    case 2: dzienTygodnia = "wtorek"; break;
    case 3: dzienTygodnia = "środa"; break;
    case 4: dzienTygodnia = "czwartek"; break;
    case 5: dzienTygodnia = "piątek"; break;
    case 6: dzienTygodnia = "sobota"; break;
  }
  return dzienTygodnia;
  }
