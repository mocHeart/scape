<template>
  <menu-header></menu-header>
  <nav>
    <router-link to="/">Home</router-link> |
    <router-link to="/about">About</router-link>
  </nav>

  <router-view></router-view>
</template>

<script setup>
import MenuHeader from '@/views/MenuHeader'

</script>

<style lang="scss">

</style>
