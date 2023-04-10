import axios from 'axios';

const http = axios.create(
    { baseURL: "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY"}
)

//Similar to Java, we can grop all the code that our client uses
//to make a request and send it to the server as a "service"
export default {

    //Everything that we export will be available to any othe file that imports this file.
    //So other files will be abkle to call getPicOfTheDay, but they will not be able to call http directly
    getPicOfTheDay(){

        //The .get() does not return the results form NASA, but instead returns a promise.
        //Think of this like when  you go to a resturant and have a wait, and they give you a device that will
        //notify you when your table is ready. Similarly, the promise will come back and let us know when we've received a response from NASA
        return http.get();
    }

}