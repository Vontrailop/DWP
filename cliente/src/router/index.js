
import VueRouter from 'vue-router'
import Vue from 'vue'

Vue.use(VueRouter);

const routes = [
    //la ruta base
    {
        path: '/',
        component:()=> import('../components/LandPage.vue')
    },
    {
        path: '/paginacion',
        name: 'paginacion',
        component:()=> import('../components/Persona.vue')
    },
    {
        path: '/paginacion2',
        name: 'paginacion2',
        component:()=> import('../components/Persona2.vue')
    },
    {
        path: '/formulario',
        name:'formulario',
        component: () => import('../components/Formulario.vue')
    },
    //las rutas asociadas a los componentes
    {
        path:'*',
        component:()=> import('../views/ErrorPages/Error404.vue')
    },
    {
        path: '/inicio',
        component: ()=> import ('../components/Inicio.vue'),

        //Los componentes que se renderizan en router-vue
        children: [
            {
                path: '/main',
                name: 'main',
                component: () => import('../components/Main.vue')
            },
            {
                path: '/tercero',
                name: 'tercero',
                component: () => import('../components/Tercero.vue')
            },
            
        ]
    }
]

const router = new VueRouter({ routes, })
export default router;