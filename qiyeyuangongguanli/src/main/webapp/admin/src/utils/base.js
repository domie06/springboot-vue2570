const base = {
    get() {
        return {
            url : "http://localhost:8080/qiyeyuangongguanli/",
            name: "qiyeyuangongguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/qiyeyuangongguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "企业员工管理系统"
        } 
    }
}
export default base
