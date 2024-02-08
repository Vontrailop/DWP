<template>
  <div class="">
    <h1>FORMULARIO</h1>
    <b-card
      bg-variant="dark"
      header="Registro Coche"
      text-variant="white"
      class="text-center"
    >
      <b-container>
        <b-form @submit="onSubmit">
        <b-row  class="mb-3">
          <b-form-group
            id="input-group-1"
            label="model:"
            label-for="input-1"
          >
            <b-form-input
              id="input-1"
              v-model="form.model"
              type="text"
              :state="form.model ? null || error.model : false"
              @input="validatemodel"
            ></b-form-input>
            <b-form-invalid-feedback tooltip>
              Ingresa un valor válido
            </b-form-invalid-feedback>
          </b-form-group>
        </b-row>
        <b-row  class="mb-3">
          <b-form-group
            id="input-group-1"
            label="brand:"
            label-for="input-1"
          >
            <b-form-input
              id="input-1"
              v-model="form.brand"
              type="text"
              :state="form.brand ? null || error.brand : false"
              @input="validatebrand"
            ></b-form-input>
            <b-form-invalid-feedback tooltip>
              Ingresa un valor válido
            </b-form-invalid-feedback>
          </b-form-group>
        </b-row>
        <b-row class="mb-3">
          <b-form-group
            id="input-group-1"
            label="Año de fabricación:"
            label-for="input-1"
          >
            <b-form-input
              id="input-1"
              v-model="form.year"
              type="number"
              :state="form.year ? null || error.year : false"
              @input="valdiateMake"
            ></b-form-input>
            <b-form-invalid-feedback tooltip>
              La fecha ingresada es invalida
            </b-form-invalid-feedback>
          </b-form-group>
        </b-row>
        <b-row>
          <b-form-group
            id="input-group-1"
            label="Número de serie:"
            label-for="input-1"
          >
            <b-form-input
              id="input-1"
              v-model="form.serie"
              type="text"
              :state="form.serie ? null || form.serie : false"
              @input="validateserie"
            ></b-form-input>
            <b-form-invalid-feedback tooltip>
              Ingresa un número de serie valido
            </b-form-invalid-feedback>
          </b-form-group>
        </b-row>
        <b-row class="mb-3 my-5">
          <b-button type="submit" variant="light">Registrar</b-button>
        </b-row>
        </b-form>
      </b-container>

    </b-card>
  </div>
</template>

<script>
import postControl from "../services/postControl"
export default {
  data() {
    return {
      form: {
        brand: "",
        model: "",
        year: 0,
        serie: ""
      },
      error:[]
    };
  },
  methods: {
    validatemodel: function(model){
      return this.error.model = this.validacionNoSignos(model);
    },
    validatebrand:function(brand){
      return this.error.brand = this.validacionNoSignos(brand);
    },
    validacionNoSignos:function(word){
      var noSigno = /^[A-Za-záéíóúüñÁÉÍÓÚÜÑ\s]+$/;
      return noSigno.test(word.trim());
    },
    valdiateMake:function(date){
      
    },
    validateserie: function(serie){
      var numAcept = /^[A-Z]{4}\d{3}-\d{2}[A-Z]{2}$/;
      return this.error.serie = numAcept.test(serie);
    },
    onSubmit: async function (event) {
      event.preventDefault();
      try {
        const data = postControl.registarCoche(this.form);
        console.log(data)
        return alert("Se registro! WUUU")
      } catch (error) {
        return alert("Valimos Queso nuevamente")
        
      }
      
    }
    
  },
};
</script>

<style></style>
