import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

import ViewUIPlus from 'view-ui-plus'
import '@/style/index.scss'

const app = createApp(App)
app.use(store)
app.use(router)

app.use(ViewUIPlus)

app.mount('#app')
