import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import jianxiuxinxi from '@/views/modules/jianxiuxinxi/list'
    import news from '@/views/modules/news/list'
    import yonghu from '@/views/modules/yonghu/list'
    import dingdanxinxi from '@/views/modules/dingdanxinxi/list'
    import peijianleixing from '@/views/modules/peijianleixing/list'
    import discusspeijianxinxi from '@/views/modules/discusspeijianxinxi/list'
    import shouhouxinxi from '@/views/modules/shouhouxinxi/list'
    import config from '@/views/modules/config/list'
    import peijianxinxi from '@/views/modules/peijianxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/jianxiuxinxi',
        name: '检修信息',
        component: jianxiuxinxi
      }
      ,{
	path: '/news',
        name: '汽车资讯',
        component: news
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/dingdanxinxi',
        name: '订单信息',
        component: dingdanxinxi
      }
      ,{
	path: '/peijianleixing',
        name: '配件类型',
        component: peijianleixing
      }
      ,{
	path: '/discusspeijianxinxi',
        name: '配件信息评论',
        component: discusspeijianxinxi
      }
      ,{
	path: '/shouhouxinxi',
        name: '售后信息',
        component: shouhouxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/peijianxinxi',
        name: '配件信息',
        component: peijianxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
