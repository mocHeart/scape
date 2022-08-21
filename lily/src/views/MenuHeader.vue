<template>
  <el-menu
    :default-active="activeIndex"
    class="el-menu-demo"
    mode="horizontal"
    :ellipsis="false"
    @select="handleSelect"
  >
    <el-menu-item index="0">大王饶命</el-menu-item>
    <div class="flex-grow" />
    <el-menu-item index="1">首页</el-menu-item>
    <el-sub-menu index="2">
      <template #title>管理</template>
      <el-menu-item index="2-1">写文章</el-menu-item>
      <el-menu-item index="2-2">开发中</el-menu-item>
    </el-sub-menu>
  </el-menu>
</template>

<script lang="ts" setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'

const router = useRouter()

const activeIndex = ref('1')
const handleSelect = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
  if (key === '2-1') {
    console.log('写文章')
    router.push('/article_edit')
  }
}

</script>

<style lang="scss" scoped>
.flex-grow {
  flex-grow: 1;
}
</style>
