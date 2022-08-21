import { createStore } from 'vuex'

export default createStore({
  state: {
    isShowMenuHeader: true,
    testText: 's1ds1122'
  },
  getters: {
  },
  mutations: {
    showMenuHeader (state) {
      state.isShowMenuHeader = true
    },
    hideMenuHeader (state) {
      state.isShowMenuHeader = false
    }
  },
  actions: {
  },
  modules: {
  }
})
