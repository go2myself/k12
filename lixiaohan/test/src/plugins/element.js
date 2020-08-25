import Vue from 'vue'
import {
  Button, Container, Header, Aside, Main, Form, FormItem, Input,
  Message
} from 'element-ui'

Vue.use(Button);
Vue.use(Container);
Vue.use(Header);
Vue.use(Aside);
Vue.use(Main);
Vue.use(Form);
Vue.use(FormItem);
Vue.use(Input);
Vue.use(Message);

Vue.prototype.$message = Message;
