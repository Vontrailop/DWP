<template>
  <div>
  <br>
  <b-breadcrumb :items="items"></b-breadcrumb>
  tercero
    
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
          to:"main"
        },
        {
          text: "Tercero",
          href: "#",
        },
        
      ]
    };
}
}
</script>

<style>

</style>