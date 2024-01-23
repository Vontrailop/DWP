<template>
  <div>
    <header class="bg-dark text-light text-center py-5">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container">
        <router-link to="/" class="navbar-brand">Your Company</router-link>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <router-link to="/main" class="nav-link">Inicio</router-link>
            </li>
            <li class="nav-item">
              <router-link to="/features" class="nav-link">Extras</router-link>
            </li>
            <!-- Add more navigation links as needed -->
          </ul>
        </div>
      </div>
    </nav>
    <h1 class="display-4 mt-4">Welcome to Our Awesome Landing Page</h1>
    <p class="lead">Discover the amazing features we offer!</p>
    <a href="#" class="btn btn-primary btn-lg mt-3">Get Started</a>
  </header>

    <section class="container my-5">
      <h2 class="text-center mb-4">Key Features</h2>

      <div class="row">
        <div class="col-md-4 mb-4">
          <div class="card">
            <img
              src="https://picsum.photos/200/300"
              class="card-img-top"
              alt="Feature 1"
            />
            <div class="card-body">
              <h5 class="card-title">Feature 1</h5>
              <p class="card-text">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
              </p>
            </div>
          </div>
        </div>

        <div class="col-md-4 mb-4">
          <div class="card">
            <img
              src="https://picsum.photos/200/300"
              class="card-img-top"
              alt="Feature 2"
            />
            <div class="card-body">
              <h5 class="card-title">Feature 2</h5>
              <p class="card-text">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
              </p>
            </div>
          </div>
        </div>

        <div class="col-md-4 mb-4">
          <div class="card">
            <img
              src="https://picsum.photos/200/300"
              class="card-img-top"
              alt="Feature 3"
            />
            <div class="card-body">
              <h5 class="card-title">Feature 3</h5>
              <p class="card-text">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
              </p>
            </div>
          </div>
        </div>
      </div>
    </section>

    <footer class="bg-dark text-light text-center py-3">
      <p>&copy; 2024 Your Company. All rights reserved.</p>
      <div class="social-icons mt-3">
        <a href="#" class="text-light me-3"><i class="fab fa-twitter"></i></a>
        <a href="#" class="text-light me-3"><i class="fab fa-facebook"></i></a>
        <a href="#" class="text-light me-3"><i class="fab fa-linkedin"></i></a>
        <a href="#" class="text-light"><i class="fab fa-instagram"></i></a>
      </div>
    </footer>
  </div>
</template>

<script>
export default {};
</script>

<style>
</style>z