<template>
  <div>
    <b-breadcrumb :items="items"></b-breadcrumb>
    <br>
    <b-link :to="{name:'inicio'}">Siguiente</b-link>
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
        },
      ],
    };
  },
};
</script>

<style>
</style>