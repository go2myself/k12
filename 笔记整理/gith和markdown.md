git和markdown学习心得
** 今天的学习主要集中在git的使用和markdown的学习上，主要包含以下两点：**
** 1. 对markdown的基本语法有了一定了解，并使用markdown撰写了今日的心得体会。首先介绍下markdown，markdown是一种纯文本格式的标记语言，通过简单的标记语法，它可以使普通的文本内容具有一定的格式：比如在文字前面加上"#"字符，就可以设置为标题，在文字前面加上不同数目的"*"字符，可以产生加粗、斜体等不同效果，具体就不全展开了。markdown格式追求的是简单、多平台统一,对于图片存储需要用图床，提供统一的外链，这样就不用在不同的平台去处理图片的问题了，下面的图片是我从一个免费的图床网站插入的：**
 ![img100.jpg](https://i.loli.net/2020/08/20/gUSbzGHqtMfni3h.jpg)

** 2.对git的使用方法和一些命令有了一些了解，虽然中途总是碰到各种问题，但大致还能解决，不过对于某些操作还不是很会，今天主要使用了以下命令：
git branch 查看本地所有分支
git status 查看当前状态
git commit 提交
git branch -a 查看所有的分支
git branch -r 查看远程所有分支
git commit -m  提交并且加注释
git remote add origin remote 建立远程仓库连接
git push origin master:develop  将本地master分支推送到远程develop分支上
git branch -D master develop 删除本地库develop
git checkout -b dev 建立一个新的本地分支dev
git merge origin/dev 将分支dev与当前分支进行合并
git checkout dev 切换到本地dev分支
git remote show 查看远程库
git add .   添加文件到本地仓库
git rm 文件名(包括路径) 从git中删除指定文件
git clone git://github.com/schacon/grit.git 从服务器上将代码给拉下来
 **  

**  3碰到的问题： 
1 如何合并远程分支？ 
分为以下几步：
1、把代码clone到本地仓库 git clone + 远程仓库名称
2、在本地创建dev分支并与远程dev分支对应 ：git checkout -b dev origin/dev
3、切换到master分支：git checkout master
4、本地的dev合并到master上：git merge dev
5、推送到远程的master上：git push origin master   

2代码提交时出现本地版本低于远程版本？不允许进行不相关的提交？
问题一：可以先pull远程，再push
问题二：push时加上  --allow-unrelated-histories

  **



