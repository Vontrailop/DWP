<template>
  <b-container>
    <!-- <div>
      <b-form @submit.prevent="checkForm" action="" method="post">
        <b-alert variant="danger" dismissible :show="errors.length > 0">
          <b>{{
            errors.length > 1
              ? "Please correct the following errors:"
              : "Please correct the following error:"
          }}</b>
          <ul>
            <li v-for="error in errors" :key="error">{{ error }}</li>
          </ul>
        </b-alert>

        <b-form-group
          id="name-group"
          label="Name"
          label-for="name"
          :state="name ? null : false"
        >
          <b-form-input
            id="name"
            v-model="name"
            type="text"
            name="name"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group
          id="age-group"
          label="Age"
          label-for="age"
          :state="age >= 0 ? null : false"
        >
          <b-form-input
            id="age"
            v-model="age"
            type="number"
            name="age"
            min="0"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group
          id="movie-group"
          label="Favorite Movie"
          label-for="movie"
          :state="movie ? null : false"
        >
          <b-form-select id="movie" v-model="movie" name="movie" required>
            <option value="Star Wars">Star Wars</option>
            <option value="Vanilla Sky">Vanilla Sky</option>
            <option value="Atomic Blonde">Atomic Blonde</option>
          </b-form-select>
        </b-form-group>

        <b-button type="submit" variant="primary">Submit</b-button>
      </b-form>
    </div> -->

    <div>
      <b-form
        @submit.prevent="checkForm"
        action="https://vuejs.org/"
        method="post"
        novalidate
      >
        <b-alert variant="danger" dismissible :show="errors.length > 0">
          <b>{{
            errors.length > 1
              ? "Please correct the following errors:"
              : "Please correct the following error:"
          }}</b>
          <ul>
            <li v-for="error in errors" :key="error">{{ error }}</li>
          </ul>
        </b-alert>

        <b-form-group
          id="name-group"
          label="Name"
          label-for="name"
          :state="name ? null : false"
        >
          <b-form-input
            id="name"
            v-model="name"
            type="text"
            name="name"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group
          id="email-group"
          label="Email"
          label-for="email"
          :state="validEmail(email) ? null : false"
        >
          <b-form-input
            id="email"
            v-model="email"
            type="email"
            name="email"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group
          id="movie-group"
          label="Favorite Movie"
          label-for="movie"
          :state="movie ? null : false"
        >
          <b-form-select id="movie" v-model="movie" name="movie" required>
            <option value="Star Wars">Star Wars</option>
            <option value="Vanilla Sky">Vanilla Sky</option>
            <option value="Atomic Blonde">Atomic Blonde</option>
          </b-form-select>
        </b-form-group>

        <b-button type="submit" variant="primary">Submit</b-button>
      </b-form>
    </div>
  </b-container>
</template>


<script>
import Vue from "vue";

export default Vue.extend({
  data() {
    return {
      errors: [],
      name: null,
      age: null,
      movie: null,
    };
  },
  methods: {
    checkForm: function (e) {
      if (this.name && this.age) {
        return true;
      }

      this.errors = [];

      if (!this.name) {
        this.errors.push("Name required.");
      }
      // if (!this.age) {
      //   this.errors.push("Age required.");
      // }
      if (!this.email) {
        this.errors.push("Email required.");
      } else if (!this.validEmail(this.email)) {
        this.errors.push("Valid email required.");
      }

      if (!this.errors.length) {
        return true;
      }

      e.preventDefault();
    },

    //custom validations
    validEmail: function (email) {
      var re =
        /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
      return re.test(email);
    },
  },
});
</script>

<style>
</style>