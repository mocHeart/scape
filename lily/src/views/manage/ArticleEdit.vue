<template>
  <el-form
    ref="ruleFormRef"
    :model="ruleForm"
    :rules="rules"
    label-width="120px"
    class="demo-ruleForm"
    :size="formSize"
    status-icon
  >
    <!-- 标题 -->
    <el-form-item label="标题" prop="title">
      <el-input v-model="ruleForm.title" />
    </el-form-item>

    <!-- 摘要 -->
    <el-form-item label="摘要" prop="desc">
      <el-input v-model="ruleForm.desc" />
    </el-form-item>

    <!-- 内容 -->
    <el-form-item label="内容" prop="content">
      <md-editor v-model="ruleForm.content" />
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm(ruleFormRef)">提交</el-button>
      <el-button @click="resetForm(ruleFormRef)">重置</el-button>
    </el-form-item>

  </el-form>
</template>

<script setup lang="ts">
import { ref, reactive } from 'vue'
import MdEditor from 'md-editor-v3'
import 'md-editor-v3/lib/style.css'

import { FormInstance, FormRules, ElMessage } from 'element-plus'

const formSize = ref('default')
const ruleFormRef = ref<FormInstance>()
const ruleForm = reactive({
  id: '',
  title: '',
  desc: '',
  content: ''
})

const rules = reactive<FormRules>({
  title: [
    { required: true, message: '请输入标题...', trigger: 'blur' },
    { min: 3, max: 25, message: '长度在 3 到 25 个字符', trigger: 'blur' }
  ],
  desc: [
    { required: true, message: '请输入标题...', trigger: 'blur' }
  ],
  content: [
    { required: true, message: '请输入内容...', trigger: 'blur' }
  ]
})

// TS语法：联合类型(Union Types)
// ES: Promise、async、await
const submitForm = async (formEle: FormInstance | undefined) => {
  if (!formEle) return
  await formEle.validate((valid, fields) => {
    if (valid) {
      ElMessage({
        message: '提交成功!',
        type: 'success',
        center: true
      })
      // 提交数据到后端
      // 跳转到xx页
      console.log(ruleForm)
    } else {
      console.log('error submit!', fields)
    }
  })
}

const resetForm = (formEle: FormInstance | undefined) => {
  if (!formEle) return
  formEle.resetFields()
}
</script>

<style lang="scss" scoped>
form {
  margin: 1vmin;
}
</style>
