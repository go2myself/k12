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

### 命令详解


#### git fetch和git pull的用法
##### git fetch
- git fetch命令
>```git fetch <远程主机名> //这个命令将某个远程主机的更新全部取回本地```

- 如果只想取回特定分支的更新，可以指定分支名：
>```git fetch <远程主机名> <分支名> //注意之间有空格```

最常见的命令如取回origin 主机的master 分支：
>```git fetch origin master```

##### git pull用法
git pull的过程可以理解为：
>git fetch origin master //从远程主机的master分支拉取最新内容 
>git merge FETCH_HEAD    //将拉取下来的最新内容合并到当前所在的分支中

- 将远程主机的某个分支的更新取回，并与本地指定的分支合并，完整格式可表示为：

  >git pull <远程主机名> <远程分支名>:<本地分支名>

如果远程分支是与当前分支合并，则冒号后面的部分可以省略：
>git pull origin next

#### git push
- git push
    git push命令用于将本地分支的更新，推送到远程主机。

    > ```git push <远程主机名> <本地分支名>:<远程分支名> ```

    注意，这里的:前后是必须没有空格的。
    如果省略远程分支名，则表示将本地分支推送与之存在"追踪关系"的远程分支（通常两者同名），如果该远程分支不存在，则会被新建。

    > ```git push origin master```

    如果省略本地分支名，则表示删除指定的远程分支，因为这等同于推送一个空的本地分支到远程分支。
    > #慎用！删除远程仓库的分支
    > ```git push origin :master```
    > #等同于
    > ```git push origin --delete master```
    上面命令表示删除origin主机的master分支。    

    如果当前分支与远程分支之间存在追踪关系，则本地分支和远程分支都可以省略。
    >```git push origin```

    如果当前分支只有一个追踪分支，那么主机名都可以省略。
    >```git push```

    如果当前分支与多个主机存在追踪关系，则可以使用-u选项指定一个默认主机，这样后面就可以不加任何参数使用git push。

    >```git push -u origin master```

    上面命令将本地的master分支推送到origin主机，同时指定origin为默认主机，后面就可以不加任何参数使用git push了。
还是有的地方不懂。



#### 冲突

这样自己github上的下游仓库就会和终端上的本地仓库一致，然后在github界面进行pull request请求就可以了。

- 解决冲突。(这个是项目参与者才会发愁的？这个不懂，只是看到了，先记录一下)
  一般就是多个开发者对同一个文件做了修改，同行修改（出现冲突），不同行git 很智能的做了自动合并不需要人为修改，一个改了push 上去，另一个由于在同一个文件修改，所以就会出现 push 不上去，这样就需要人为解决（团队之间要商量）把那些有用的代码梳理好在提交，如果不商量很容易把别人的代码给丢弃了。
  需要将远程仓库的代码git pull下来，git diff查看本地分支与远程分支的区别。
  手动解决冲突，将出现的冲突文件打开，选择要保留的内容，git将仓库中有冲突的代码标出来了，最上面的是本地的修改，下面的是远程仓库的修改，我们选择要保留的代码即可



#### git命令行去spring工程文件

在操作git时，把文件提交到暂存区，那些不必要的配置文件总是要被提交。.idea和target目录或者文件都是不需要提交的。
1. 在项目根目录 按住 shift + 右键， 选择 Git Bash Here，打开 Git 命令控制台
2. 使用命令在项目根目录下 新建一个 .gitignore文件 命令： touch .gitignore （注意： 这里的命令用 在 cmd 中是无法使用的哦）
3. 用编辑器或者相关文本编辑器打开刚刚新建的.gitignore文件，将需要忽略的文件在这里写明即可

如果已经提交，add进文件被拉进了代码库，删除本地缓存，但是不删除文件。就不会被提交了。
>```git rm --cached -r .idea/```
```git commit -m '移除测试文件'```