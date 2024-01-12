<template>
  <div>
    <b-breadcrumb :items="items"></b-breadcrumb>
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