const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm391lx/",
            name: "ssm391lx",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm391lx/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "轻型卡车零部件销售平台"
        } 
    }
}
export default base
