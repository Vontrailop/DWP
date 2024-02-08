<template>
  <div>
    <header class="bg-dark text-light text-center py-5">
      <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
          <router-link to="/" class="navbar-brand">Tu vehiculo</router-link>
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
              <li class="nav-item">
                <router-link to="/inicio" class="nav-link">Inicio</router-link>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <h1 class="display-4 mt-4">Bienvenido!!</h1>
    </header>
    <section class="container my-5">
      <div>
        <b-carousel
          id="carousel-1"
          v-model="slide"
          :interval="4000"
          controls
          indicators
          background="#ababab"
          img-width="1024"
          img-height="480"
          style="text-shadow: 1px 1px 2px #333"
          @sliding-start="onSlideStart"
          @sliding-end="onSlideEnd"
        >
        <b-carousel-slide
            caption="First slide"
            text="Nulla vitae elit libero, a pharetra augue mollis interdum."
            img-src="https://picsum.photos/1024/480/?image=52"
          ></b-carousel-slide>
          <b-carousel-slide img-src="https://picsum.photos/1024/480/?image=54">
          <h1>Hello world!</h1>
          </b-carousel-slide>
          <b-carousel-slide
            img-src="https://picsum.photos/1024/480/?image=58"
          ></b-carousel-slide>
          <b-carousel-slide>
            <template #img>
                <img
                class="d-block img-fluid w-100"
                width="1024"
                height="480"
                src="https://picsum.photos/1024/480/?image=55"
                alt="image slot"
              />
              </template>
              </b-carousel-slide>
              <b-carousel-slide
            caption="Blank Image"
            img-blank
            img-alt="Blank image"
          >
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit.
              Suspendisse eros felis, tincidunt a tincidunt eget,
              convallis vel est. Ut pellentesque ut lacus vel interdum.
            </p>
            </b-carousel-slide>
            </b-carousel>
            </div>
            </section>
  </div>
</template>

<script>
export default {
  data() {
    return {
      slide: 0,
      sliding: null,
    };
  },
  methods: {
    onSlideStart(slide) {
      this.sliding = true;
    },
    onSlideEnd(slide) {
      this.sliding = false;
    },
  },
};
</script>

<style>
</style>