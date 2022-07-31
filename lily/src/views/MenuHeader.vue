<template>
  <div class="menubar" :v-show="store.state.isShowMenuHeader">
    <div class="left">
      MOC‘s HOME
    </div>
    <div class="center">
      <Menu mode="horizontal" :theme="theme" active-name="1">
          <MenuItem name="1">
              <Icon type="ios-home" />
              首页
          </MenuItem>
          <Submenu name="2">
              <template #title>
                  <Icon type="ios-stats" />
                  关于
              </template>
              <MenuItem name="2-1">
                <Icon type="md-person" />
                我
              </MenuItem>
              <MenuItem name="2-2">
                <Icon type="md-rose" />
                主题
              </MenuItem>
          </Submenu>
          <Submenu name="3">
              <template #title>
                  <Icon type="ios-stats" />
                  清单
              </template>
              <MenuItem name="3-1">
                <Icon type="md-person" />
                归档
              </MenuItem>
              <MenuItem name="3-2">
                <Icon type="md-rose" />
                标签
              </MenuItem>
          </Submenu>
          <MenuItem name="4">
              <Icon type="ios-home" />
              微言
          </MenuItem>
          <MenuItem name="5">
              <Icon type="ios-home" />
              留言
          </MenuItem>
          <MenuItem name="6">
              <Icon type="ios-home" />
              实验室
          </MenuItem>
          <MenuItem name="7">
              <Icon type="ios-home" />
              开往
          </MenuItem>
      </Menu>
    </div>
    <div class="right">
      <div>
        <Icon type="ios-search" size="24" />
      </div>
      <div>
        <Icon type="ios-moon-outline" size="24" />
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import { Menu } from 'view-ui-plus'
import { useStore } from 'vuex'

const theme = ref('light')
const store = useStore()

</script>

<style lang="scss" scoped>
.menubar {
  border: 1px solid red;
  margin: 0 8vw;
  display: flex;
  .left {
    border: 1px solid green;
    line-height: 60px;
  }
  .center {
    border: 1px solid blue;
  }
  .right {
    display: flex;
    border: 1px solid pink;
    div {
      line-height: 60px;
      width: 3vw;
    }
  }
}

</style>
