<template>
  <div class="mb-3 my-3">
    <b-breadcrumb :items="items"></b-breadcrumb>
    <b-card bg-variant="dark" text-variant="white" title="INCIO">
      <b-card-text>
        Bienvenido a coches de Rayo MCQUEEN
      </b-card-text>
      <b-button href="from" variant="primary">REGISTRAR</b-button>
    </b-card>
  </div>
</template>

<script>
export default {
  data() {
      return {
        items: [
          {
            text: 'Inicio',
            href: '/inicio',
            active: true
          },
          {
            text: 'Registro de Coche',
            href: '/from'
          },
          {
            text: 'Información',
            href: '/info'
          }
        ]
      }
  }
};
</script>

<style></style>
