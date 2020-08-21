<template>
  <el-container class="all_container">
    <el-header>Header</el-header>
    <el-container>
      <el-aside width="200px">Aside</el-aside>
      <el-main>Main</el-main>
    </el-container>
  </el-container>
</template>

<style  scoped>
.all_container{
    color: aliceblue;
    height: 100%;
}
.el-header {
  background-color: #000;
}
.el-aside {
  background-color: rgb(38, 33, 68);
}
.el-main {
  background-color: rgb(156, 156, 156);
}
</style>
