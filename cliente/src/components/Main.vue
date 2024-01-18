<template>
  <div>
    <b-breadcrumb :items="items"></b-breadcrumb>
    <hr>
    <b-link :to="{name:'tercero'}">Siguiente</b-link>
  </div>
</template>

<script>
export default {
  data() {
    return {
      items: [
        {
          text: "Inicio",
          href: "#",
          to: "Inicio",
        },
        {
          text: "Siguiente",
          href: "#",
        },
      ],
    };
  },
};
</script>

<style>
</style>