####  预处理仓库

- 主要包括fork和clone
  1. fork。在github页面，点击fork按钮。将别人的仓库复制一份到自己的仓库。
  2. clone。将github中的仓库克隆到自己本地电脑中。



####  使用

- 根据理解，可以分为项目参与者(好像还可以设置权限，暂时不表)，和项目使用者。这个笔记主要讨论项目使用者。

  1. 首先将fork的仓库(自己的仓库，以下游仓库代称)clone到本地终端上，然后进入自己本机上的仓库操作（本机仓库称）。如果之前有仓库，内容和上游仓库有较大出入，可以同步更新。

  > 首先保证本地仓库的upstream是源项目的URL，若没有则添加：
  >   ```git remote add upstream URL```

  >然后利用fetch和merge合并upstream的master分支：
  >```git fetch upstream```
  >```git merge upstream/master```

  >然后利用push将本地分支覆盖到git远程分支上
  >```git push origin master:master````

    以上步骤只是将下游仓库和上游仓库信息一致。如果要修改后提交，请继续看。

- 提交步骤。
  1. ```git clone XXX``` //克隆代码库
  2. ```git checkout -b test ```//新建分支
  1. ```git add .```   //加入修改
  2. ```git commit -m "提交修改的信息"```
  3. ```git checkout master ```//切换到master分支
  4. ```git pull``` //更新代码，建议用fetch merge
  5. ```git checkout test``` //切换到test分支
  6. ```git meger master``` //把master分支的代码merge到test分支
  3. ```git push origin 分支名```   //把test分支的代码push到远程库

这样自己github上的下游仓库就会和终端上的本地仓库一致，然后在github界面进行pull request请求就可以了。

- 解决冲突。(这个是项目参与者才会发愁的？这个不懂，只是看到了，先记录一下)
  一般就是多个开发者对同一个文件做了修改，同行修改（出现冲突），不同行git 很智能的做了自动合并不需要人为修改，一个改了push 上去，另一个由于在同一个文件修改，所以就会出现 push 不上去，这样就需要人为解决（团队之间要商量）把那些有用的代码梳理好在提交，如果不商量很容易把别人的代码给丢弃了。
  需要将远程仓库的代码git pull下来，git diff查看本地分支与远程分支的区别。
  手动解决冲突，将出现的冲突文件打开，选择要保留的内容，git将仓库中有冲突的代码标出来了，最上面的是本地的修改，下面的是远程仓库的修改，我们选择要保留的代码即可

