<template>
  <div class="login_container">
    <div class="login_box">
      <!-- 头像 -->
      <div class="logo_box">
        <img src="../assets/logo.png" alt="头像" />
      </div>
      <!-- 登陆表单 -->
      <el-form ref="loginFormRef" class="login_form" :model="form" :rules="rules">
        <el-form-item prop="username">
          <el-input v-model="form.username" prefix-icon="iconfont icon-yonghu" placeholder="请输入用户名"></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input
            v-model="form.password"
            prefix-icon="iconfont icon-suo"
            placeholder="请输入密码"
            show-password
          ></el-input>
        </el-form-item>
        <el-form-item class="btns">
          <el-button type="primary" @click="onSubmit">登录</el-button>
          <el-button type="info" @click="onReset">重置</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      form: {
        username: '',
        password: ''
      },
      rules: {
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' },
          { min: 1, max: 5, message: '长度在 1 到 5 个字符', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请输入密码', trigger: 'blur' },
          {
            trigger: 'blur',
            validator: (rule, value, callback) => {
              console.log(rule)
              var passwordreg = /(?=.*\d)(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).{6,16}/
              if (!passwordreg.test(value)) {
                callback(
                  new Error('密码必须由数字、字母、特殊字符组合,请输入6-16位')
                )
              } else {
                callback()
              }
            }
          }
        ]
      }
    }
  },
  methods: {
    // 提交
    onSubmit() {
      var that = this;
      this.$refs.loginFormRef.validate(valid => {
        if (valid) {
          this.$router.push('/test')
        } else {
          that.$message.error({
            message: '登陆失败，用户名或密码错误',
            duration: 3000
          })
        }
      })
    },
    // 重置
    onReset() {
      this.$refs.loginFormRef.resetFields()
    }
  }
}
</script>
<style lang="less" scoped>
.login_container {
  background-color: #2b4b6b;
  height: 100%;
}
.login_box {
  background-color: #fff;
  height: 300px;
  width: 450px;
  position: absolute;
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);
  border-radius: 5px;
  .logo_box {
    border: 1px solid #eee;
    height: 130px;
    width: 130px;
    border-radius: 50%;
    padding: 10px;
    box-shadow: 0 0 20px #ddd;
    position: absolute;
    left: 50%;
    transform: translate(-50%, -50%);
    background-color: #fff;
    img {
      height: 100%;
      width: 100%;
      border-radius: 50%;
      background-color: #eee;
    }
  }
}

.login_form {
  position: absolute;
  bottom: 0;
  width: 100%;
  padding: 0 20px;
  // 设置为宽度固定
  box-sizing: border-box;
}
.btns {
  display: flex;
  justify-content: flex-end;
}
</style>
