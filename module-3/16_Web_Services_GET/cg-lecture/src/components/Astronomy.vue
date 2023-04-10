<template>
  <div>
      <h1>{{ picOfTheDay.title }}</h1>
      <p>{{picOfTheDay.explanation}}</p>
      <img v-bind:src="picOfTheDay.url" />
  </div>
</template>

<script>
import AstronomyService from '../services/AstronomyService.js'

export default {
    name: "astronomy",
    data(){
        return {
            picOfTheDay: {}
        }
    },
    //This is a lifecycle hook, as soon as the component is created
    //it will run this code automatically
    created() {
        AstronomyService.getPicOfTheDay().then(
            (response) => {
                this.picOfTheDay = response.data;
            }
        )
    }
}
</script>

<style>

</style>
