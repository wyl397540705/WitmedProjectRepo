<template>
  <div class="login_container">
    <div class="login_box">
      <h2 style="text-align: center">智慧医疗管理系统</h2>
      <!-- 登录表单区域 -->
      <el-form size="mini">
        <!-- 用户名 -->
        <el-form-item>
          <el-input placeholder="用户名" prefix-icon="el-icon-s-check" v-model="cellphone"></el-input>
        </el-form-item>
        <!-- 密码 -->
        <el-form-item>
          <el-input placeholder="密码" prefix-icon="el-icon-lock" v-model="password"></el-input>
        </el-form-item>
        <!-- 记住我 -->
        <el-form-item>
          <el-checkbox label="记住我" class="rememberMe"></el-checkbox>
        </el-form-item>
        <!-- 登录按钮 -->
        <el-form-item>
          <el-button type="primary" @click="loginAdmin">登录</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>
<script>
export default {
  name: "Login",
  data:function (){
    return{
      cellphone:"",
      password:""
    }
  },
  methods:{
    loginAdmin:function (){
      //进行异步登录
      this.$axios.post("http://localhost:11111/system/admin/admin/login",{
        "cellphone": this.$data.cellphone,
        "password": this.$data.password
      }).then(resp =>{
        // 通过 response 对象获得后端返回的数据
        var responseVO = resp.data;
        // 通过后端响应对象 responseVO 获得响应编码
        var code = responseVO.code;
        if (code == 20000){
          alert(responseVO.message);
          // 需要将页面从新返回到列表页面
          this.$router.push("/");
        }else {
          alert("登录失败");
        }
      });
    }
  }
}
</script>

<style scoped>
.login_container {
  background-image: linear-gradient(-180deg, #1a1454 0%, #0e81a5 100%);
  /*background-image: url("../images/bg_login.png");*/
  background-repeat: no-repeat;
  background-size: cover;
  height: 100%;
}
.login_box {
  width: 290px;
  height: 350px;
  /* background-color: #fff; */
  background-color: #2e527bb3;
  border-radius: 5px;

  position: absolute;
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);
}
.el-form {
  padding: 32px;
  position: absolute;
  bottom: 0;
  width: 100%;
  box-sizing: border-box;
}
.el-button {
  width: 100%;
}
.code {
  width: 45%;
}
.rememberMe {
  color: #fff;
}
</style>
