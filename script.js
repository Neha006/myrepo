// first step fetch api 
fetch('https://icanhazdadjoke.com/slack')
// collect data from api and convert into json 
.then(data=>data.json())
// then colect joke text from the data 
.then(jokeData => {
    const jokeText=jokeData.attachments[0].text;
    const jokeElement =document.getElementById('jokeElement');
    jokeElement.innerHTML=jokeText;
})