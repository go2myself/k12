# zhxy-mobile

## 基本信息模块

### 数据库表

- USER_INFO

	- id、登录名、登录密码、姓名、性别、是否启用、手机号码、员工编号、邮箱、身份证号、学校编号

- STUDENT_INFO

	- id、客户属性、姓名、性别、手机号码、证件类型、证件号、状态、班级id、学工号、UPDATE_DT、资料更新时间、批次、出生日期、家庭住址、父亲姓名、母亲姓名、父亲电话、母亲电话、常用联系人、学校id

- SCHOOL_INFO

	- id、学校名称、描述、创建日期、创建时间、机构编码、地址

- MOBILE_USER_INFO

	- 登录手机号、用户信息、

- GRADE_INFO

	- id、年级、学校id

- CLASS_INFO

	- id、班级名、状态、年级编号、学校id

### 登录用户信息接口/gd

- /userinfo

	- 查询登录用户信息

### 用户信息接口/gd/userinfo

- /index

	- 跳转到/gd/UserINfoIndex页面

- /find

	- 分页查询用户信息

		- 参数：Page<UserINfoVO> svp,UserINfoVO sv
		- 输出：IPage<UserINfoVO>

- /delete

	- 批量删除

		- delete  参数：List<UserINfoVO> userinfoList
		- 输出：void

- /info

	- 查看

		- get  参数：UserINfoVO userinfoVO
		- 输出：UserINfoVO

- /update

	- 更新

		- put  参数：UserINfoVO userinfoVO
		- 输出void

- /insert

	- 插入

		- post 参数：UserINfoVO userinfoVO
		- 输出：void

### 学生信息接口/gd/studentinfo

- /index

	- 跳转到/gd/StudentInfoIndex页面

- /find

	- 分页查询学生信息

		- 参数：Page<StudentInfoVO> svp,StudentInfoVO sv
		- 输出：IPage<StudentInfoVO>

- /delete

	- 批量删除

		- delete  参数：List<StudentInfoVO> StudentInfoList
		- 输出：void

- /info

	- 查看

		- get  参数：StudentInfoVO studentinfo
		- 输出：StudentInfoVO

- /update

	- 更新

		- put  参数：StudentInfoVO studentinfoVO
		- 输出void

- /insert

	- 插入

		- post 参数：StudentInfoVO studentinfoVO
		- 输出：void

- /student/{identity}/{schoolId}

	- 学生信息查询

### 学校信息接口/gd/schoolinfo

- /index

	- 跳转到/gd/SchoolInfoIndex页面

- /find

	- 分页查询学校信息

		- 参数：Page<SchoolInfoVO> svp,SchoolInfoVO sv
		- 输出：IPage<SchoolInfoVO>

- /delete

	- 批量删除

		- delete  参数：List<SchoolInfoVO> SchoolInfoList
		- 输出：void

- /info

	- 查看

		- get  参数：SchoolInfoVO schoolinfo
		- 输出：SchoolInfoVO

- /update

	- 更新

		- put  参数：SchoolInfoVO schoolinfoVO
		- 输出void

- /insert

	- 插入

		- post 参数：SchoolInfoVO schoolinfoVO
		- 输出：void

### 年级信息接口/gd/gradeinfo

- /index

	- 跳转到/gd/GradeInfoIndex页面

- /find

	- 分页查询年级信息

		- 参数：Page<GradeInfoVO> svp,GradeInfoVO sv
		- 输出：IPage<GradeInfoVO>

- /delete

	- 批量删除

		- delete  参数：List<GradeInfoVO> gradeinfoList
		- 输出：void

- /info

	- 查看

		- get  参数：GradeInfoVO gradeinfo
		- 输出：GradeInfoVO

- /update

	- 更新

		- put  参数：GradeInfoVO gradeinfoVO
		- 输出void

- /insert

	- 插入

		- post 参数：GradeInfoVO gradeinfoVO
		- 输出：void

### 移动用户信息接口/gd/mobileuserinfo

- /index

	- 跳转到/gd/MobileUserInfoIndex页面

- /find

	- 分页查询移动用户信息

		- 参数：Page<MobileUserInfoVO> svp,MobileUserInfoVO sv
		- 输出：IPage<MobileUserInfoVO>

- /delete

	- 批量删除

		- delete  参数：List<MobileUserInfoVO> mobileinfoList
		- 输出：void

- /info

	- 查看

		- get  参数：MobileUserInfoVO mobileuserinfo
		- 输出：MobileUserInfoVO

- /update

	- 更新

		- put  参数：MobileUserInfoVO mobileuserinfoVO
		- 输出void

- /insert

	- 插入

		- post 参数：MobileUserInfoVO mobileuserinfoVO
		- 输出：void

### 班级信息接口/gd/classinfo

- /index

	- 跳转到/gd/ClassInfoIndex页面

- /find

	- 分页查询班级信息

		- 参数：Page<ClassInfoVO> svp,ClassInfoVO sv
		- 输出：IPage<ClassInfoVO>

- /delete

	- 批量删除

		- delete  参数：List<ClassInfoVO> classinfoList
		- 输出：void

- /info

	- 查看

		- get  参数：ClassInfoVO classinfo
		- 输出：ClassInfoVO

- /update

	- 更新

		- put  参数：ClassInfoVO classinfoVO
		- 输出void

- /insert

	- 插入

		- post 参数：ClassInfoVO classinfoVO
		- 输出：void

- /getClassInfo/{userId}

	- 教师端：班级信息查询

		- get 参数：String userId
		- 输出：ResponseVO

### 课程接口/gd/cources

- /index

	- 跳转到/gd/CourcesIndex页面

- /find

	- 分页查询课程信息

		- 参数：Page<CourcesVO> svp,CourcesVO sv
		- 输出：IPage<CourcesVO>

- /delete

	- 批量删除

		- delete  参数：List<CourcesVO> courcesList
		- 输出：void

- /info

	- 查看

		- get  参数：CourcesVO cources
		- 输出：ClassInfoVO

- /update

	- 更新

		- put  参数：CourcesVO courcesVO
		- 输出void

- /insert

	- 插入

		- post 参数：CourcesVO courcesVO
		- 输出：void

- /getCources/{stuIdentity}/{schoolId}

	- 获取课表数据

		- get  参数：String stuIdentity,String schoolId
		- 输出：ResponseVO

## 成绩单模块

### 数据库表

- SCORES_PLAN

	- id、学校id、成绩单标题、文件id、发布时间

- SCORE

	- id、成绩单id、学生id、身份证号、学生姓名、学生成绩

### 成绩单类型接口/gd/scoresplan

- /index

	- 跳转到/gd/ScoresPlanIndex页面

- /find

	- 分页查询成绩单信息

		- 参数：Page<ScoresPlanVO> svp,ScoresPlanVO sv
		- 输出：IPage<ScoresPlanVO>

- /delete

	- 批量删除

		- delete  参数：List<ScoresPlanVO> scoresplanList
		- 输出：void

- /info

	- 查看

		- get  参数：ScoresPlanVO scoresplan
		- 输出：ScoresPlanVO

- /update

	- 更新

		- put  参数：ScoresPlanVO scoresplanVO
		- 输出void

- /insert

	- 插入

		- post 参数：ScoresPlanVO scoresplanVO
		- 输出：void

- /getScoreList/{stuIdentity}/{schoolId}/{pageNumber}/{pageSize}

	- get  参数：String stuIdentity,String schoolId,String pageNumber,String pageSize
	- 输出：ResponseVO

### 成绩单详情接口/gd/score

- /index

	- 跳转到/gd/ScoreIndex页面

- /find

	- 分页查询成绩单信息

		- 参数：Page<ScoreVO> svp,ScoreVO sv
		- 输出：IPage<ScoreVO>

- /delete

	- 批量删除

		- delete  参数：List<ScoreVO> scoreList
		- 输出：void

- /info

	- 查看

		- get  参数：ScoreVO cscore
		- 输出：ScoreVO

- /update

	- 更新

		- put  参数：ScoreVO scoreVO
		- 输出void

- /insert

	- 插入

		- post 参数：ScoreVO scoreVO
		- 输出：void

- /getScoreSDetail/{planId}/{stuIdentity}

	- 获取成绩单详情

		- get  参数：String planId,String stuIdentity
		- 输出：ResponseVO

## 缴费模块

### 数据库表

- PAYFEEPLAN

	- id、缴费单名称、缴费起始时间、缴费终止时间、缴费状态、结算账号、学校id、缴费单code、提前提醒天数、缴费说明

- PAYFEEBILL

	- id、缴费类型id、所属缴费单id、缴费项id、学生id、班级id、应缴金额、缴费状态、备注、所属学校id、缴费单号、缴费时间、证件号、发布状态、缴费项目编号、缴费项目名称、学校名称、学生名称、缴费单名称、payNo、feeStatus

### 缴费查询接口/gd

- epays/{schoolId}/{identity}

	- 参数：String schoolId,String identity
	- ResponseVO

### 缴费类型接口/gd/payfeeplan

- /index

	- 跳转到/gd/PayfeePlanIndex页面

- /find

	- 分页查询缴费类型

		- 参数：Page<PayfeePlanVO> svp,PayfeePlanVO sv
		- 输出：IPage<PayfeePlanVO>

- /delete

	- 批量删除

		- delete  参数：List<PayfeePlanVO> payfeeplanList
		- 输出：void

- /info

	- 查看

		- get  参数：PayfeePlanVO  payfeeplan
		- 输出：PayfeePlanVO

- /update

	- 更新

		- put  参数：PayfeePlanVO payfeeplanVO
		- 输出void

- /insert

	- 插入

		- post 参数：PayfeePlanVO payfeeplanVO
		- 输出：void

### 缴费账单接口/gd

- /payfeebills

	- 查询缴费账单

		- get  参数：PayfeeBillVO  payfeeBillVO
		- 输出：ResponseVO

- /getPayfeeInfo

	- 缴费信息汇总

		- post  参数：Map<String,String> params
		- 输出：ResponseVO

- /getPayfeeDetailInfo

	- 查询详细缴费信息

		- post  参数：Map<String,String> params
		- 输出：ResponseVO

## 消息模块

### 数据库表

- INFORMATION_TYPE

	- 消息类型id、消息类型名、

- INFORMATION

	- 消息id、消息内容id、学生身份证号或老师手机号、阅读状态、用户类型、学校id

- INFORMATION_CONTENT

	- 消息内容id、消息标题、消息内容、发送人姓名、存登录账号、消息类型id、消息发布时间、删除状态、类型id

- INFORMATION_CLASS_RELA

	- 消息内容id、班级id

### 消息类型接口/gd/informationtype

- /index

	- 跳转到/gd/InformationTypeIndex页面

- /find

	- 分页查询消息类型

		- 参数：Page<InformationTypeVO> svp,InformationTypeVO sv
		- 输出：IPage<InformationTypeVO>

- /delete

	- 批量删除

		- delete  参数：List<InformationTypeVO> informationtypeList
		- 输出：void

- /info

	- 查看

		- get  参数：InformationTypeVO  informationtype
		- 输出：InformationTypeVO

- /update

	- 更新

		- put  参数：InformationTypeVO informationtypeVO
		- 输出void

- /insert

	- 插入

		- post 参数：InformationTypeVO informationtypeVO
		- 输出：void

### 消息接口/gd/information

- /index

	- 跳转到/gd/InformationIndex页面

- /find

	- 分页查询消息

		- 参数：Page<InformationVO> svp,InformationVO sv
		- 输出：IPage<InformationVO>

- /delete

	- 批量删除

		- delete  参数：List<InformationVO> informationList
		- 输出：void

- /info

	- 查看

		- get  参数：InformationVO  information
		- 输出：InformationVO

- /update

	- 更新

		- put  参数：InformationVO informationVO
		- 输出void

- /insert

	- 插入

		- post 参数：InformationVO informationVO
		- 输出：void

- /getInfo/{stuIdentity}/{schoolId}

	- 家长端：获取校园动态

		- get  参数：String stuIdentity,String schoolId
		- 输出：ResponseVO

- /getInfoList/{stuIdentity}/{schoolId}/{infoTypeId}/{pageNumber}/{pageSize}

	- 获取学生在学校通知列表

		- get  参数：String stuIdentity,String schoolId,String infoTypeId,String pageNumber,String pageSize
		- 输出：ResponseVO

- /getInfoDetail/{id}/{infoTypeId}/{stuIdentity}

	- 获取某条通知的详情，修改读取状态

		- get  参数：String id,String infoTypeId,String stuIdentity
		- 输出：ResponseVO

- /teacherGetInfo/{userId}/{phoneNo}/{schoolId}

	- 教师端：获取校园动态

		- get  参数：String userId,String phoneNo,String schoolId
		- 输出：ResponseVO

- /teacherGetInfoList/{phoneNo}/{schoolId}/{infoTypeId}/{pageNumber}/{pageSize}

	- 教师获取在当前学校的通知列表

		- get  参数：String phoneNo,String schoolId,String infoTypeId,String pageNumber,String pageSize
		- 输出：ResponseVO

- /getPrivName/{userId}/{phoneNo}

	- 教师端：获取消息相关权限

		- get  参数：String userId,String phoneNo
		- 输出:ResponseVO

- /publishNews

	- 教师端：消息管理，发布消息

		- post  参数：Map<String,String> params
		- ResponseVO

- /getDetailNews/{id}/{phoneNo}/{schoolId}/{infoTypeId}/{pageNumber}/{pageSize}

	- 教师端：获取消息详情

		- get  参数：String id,String phoneNo,String schoolId,String infoTypeId,String pageNumber,String pageSize
		- 输出：ResponseVO

### 消息内容接口/gd/informationcontent

- /index

	- 跳转到/gd/InformationContentIndex页面

- /find

	- 分页查询消息内容

		- 参数：Page<InformationContentVO> svp,InformationContentVO sv
		- 输出：IPage<InformationContentVO>

- /delete

	- 批量删除

		- delete  参数：List<InformationContentVO> informationcontentList
		- 输出：void

- /info

	- 查看

		- get  参数：InformationContentVO  informationcontent
		- 输出：InformationContentVO

- /update

	- 更新

		- put  参数：InformationContentVO informationcontentVO
		- 输出void

- /insert

	- 插入

		- post 参数：InformationContentVO informationcontentVO
		- 输出：void

### 班级消息接口/gd/informationclassrela

- /index

	- 跳转到/gd/InformationClassRelaIndex页面

- /find

	- 分页查询班级消息

		- 参数：Page<InformationClassRelaVO> svp,InformationClassRelaVO sv
		- 输出：IPage<InformationClassRelaVO>

- /delete

	- 批量删除

		- delete  参数：List<InformationClassRelaVO> informationclassrelaList
		- 输出：void

- /info

	- 查看

		- get  参数：InformationClassRelaVO  informationclassrela
		- 输出：InformationClassRelaVO

- /update

	- 更新

		- put  参数：InformationClassRelaVO informationclassrelaVO
		- 输出void

- /insert

	- 插入

		- post 参数：InformationClassRelaVO informationclassrelaVO
		- 输出：void

## 绑定模块

### 数据库表

- BINDING_STUDENT

	- bindId，学生、家长登录手机号码，学生身份证号码，学校id，微信登录id，掌银登录id，绑定状态

- BINDING_SCHOOL_TEACHER

	- bindId，登录手机号，学校id，用户id，班级id，微信登录id，掌银登录id

- BINDING_SCHOOL_PARENT

	- bindId，学生、家长登录手机号码，学校id，微信登录id，掌银登录id，绑定状态，学生省份证号码

### 登录凭证与学生信息绑定接口/gd/bindingstudent

- /index

	- 跳转到/gd/BindingStudentIndex页面

- /find

	- 分页查询绑定学校

		- 参数：Page<BindingStudentVO> svp,BindingStudentVO sv
		- 输出：IPage<BindingStudentVO>

- /delete

	- 批量删除

		- delete  参数：List<BindingStudentVO> bindingstudentList
		- 输出：void

- /info

	- 查看

		- get  参数：BindingStudentVO  bindingstudent
		- 输出：BindingStudentVO

- /update

	- 更新

		- put  参数：BindingStudentVO bindingstudentVO
		- 输出void

- /insert

	- 插入

		- post 参数：BindingStudentVO bindingstudentVO
		- 输出：void

- /school/{phoneNo}

	- 绑定学校信息查询

		- get  参数：String phoneNo
		- 输出：ResponseVO

- /getAllBindStuInfo/{phoneNo}

	- 绑定学生信息查询

		- get  参数：String phoneNo
		- 输出：ResponseVO

- /bindingList/{phoneNo}/{id}

	- 绑定学校信息

		- get  参数：String phoneNo,BigDemical id
		- 输出：ResponseVO

- /cancelBind/{phoneNo}/{id}

	- 解绑学校信息

		- get  参数：String phoneNo,BigDemical id
		- 输出：ResponseVO

- /updateStuBind/{phoneNo}/{id}

	- 更新学生绑定表状态

		- get  参数：String phoneNo,BigDemical id
		- 输出：ResponseVO

### 登录凭证与老师信息绑定接口/gd/bindingschoolteacher

- /index

	- 跳转到/gd/BindingSchoolTeacherIndex页面

- /find

	- 分页查询绑定老师信息

		- 参数：Page<BindingSchoolTeacherVO> svp,BindingSchoolTeacherVO sv
		- 输出：IPage<BindingSchoolTeacherVO>

- /delete

	- 批量删除

		- delete  参数：List<BindingSchoolTeacherVO> bindingschoolteacherList
		- 输出：void

- /info

	- 查看

		- get  参数：BindingSchoolTeacherVO  bindingschoolteacher
		- 输出：BindingSchoolTeacherVO

- /update

	- 更新

		- put  参数：BindingSchoolTeacherVO bindingschoolteacherVO
		- 输出void

- /insert

	- 插入

		- post 参数：BindingSchoolTeacherVO bindingschoolteacherVO
		- 输出：void

### 登录凭证与家长信息绑定接口/gd/bindingschoolparent

- /index

	- 跳转到/gd/BindingSchoolParentIndex页面

- /find

	- 分页查询绑定老师信息

		- 参数：Page<BindingSchoolParentVO> svp,BindingSchoolParentVO sv
		- 输出：IPage<BindingSchoolParentVO>

- /delete

	- 批量删除

		- delete  参数：List<BindingSchoolParentVO> bindingschoolparentList
		- 输出：void

- /info

	- 查看

		- get  参数：BindingSchoolParentVO  bindingschoolparent
		- 输出：BindingSchoolParentVO

- /update

	- 更新

		- put  参数：BindingSchoolParentVO bindingschoolparentVO
		- 输出void

- /insert

	- 插入

		- post 参数：BindingSchoolParentVO bindingschoolparentVO
		- 输出：void

- /bindingSchoolList/{phoneNo}/{schoolId}/{studentIdcd}

	- 绑定学生信息查询

		- get  参数：String phoneNo,String schoolId,String studentIdcd
		- 输出：ResponseVO

- /cancelBindSchool/{phoneNo}/{schoolId}/{studentIdcd}

	- 解绑学生信息查询

		- get  参数：String phoneNo,String schoolId,String studentIdcd
		- 输出：ResponseVO

- /updateSchBind/{phoneNo}/{schoolId}/{studentIdcd}

	- 更新学生学生绑定表状态

		- get  参数：String phoneNo,String schoolId,String studentIdcd
		- 输出：ResponseVO

- /getNoBindSchList

	- 查询学生未绑定学校列表

		- post  参数：Map<String,String> params
		- 输出：ResponseVO

## 请假模块

### 数据库表

- ASK_LEAVE_TYPE

	- ID:请假类型id，NAME:请假类型

- ASK_LEAVE

	- 请假id、学生姓名、学生身份证号、申请人姓名、申请人手机号、请假类型、请假事由、请假开始时间、请假结束时间、审批人姓名、审批人手机号、审批时间、审批状态、班级id、学校id、申请时间

### 请假信息接口/gd/askleave

- /getAskLeaveList/{stuIdentity}/{pageNumber}/{pageSize}

	- 获取我的请假列表

		- get  参数：String stuIdentity，String pageNumber,String pageSize
		- 输出：ResponseVO，封装的数组数据包括id、学生姓名、请假类型名、开始时间、申请时间、审批状态

- /subAskLeave

	- 提交我的请假申请

		- 参数：Map<String,String> params包括学生身份证号码、请假类型、开始时间、结束时间、申请人、申请人手机号、请假原因、学校id
		- 输出：ResponseVO，封装一个请假id返回

- /getAskLeaveDetail/{id}

	- 获取我的请假单内容

		- get 参数：String id
		- 输出：ReponseVO,封装的数据包括请假人、年级、班级、请假类型、申请时间、请假原因、开始时间、结束时间、申请人、联系电话、审核状态

- /getAskLeaveListByTeacher

	- 教师端获取请假申请列表

		- get 参数：String startTime,String endTime,String classID,String Status,String stuName,String teacherId,String pageNumber,String pageSize
		- 输出：ReponseVO，封装数组数据包括请假单id、学生姓名、开始时间、结束时间、申请时间、审核状态

- /checkAskLeave

	- 教师端审核待审核状态的请假单

		- post 参数：Map<String,String> params  (包括teacherId,askLeaveId,status)
		- 输出：ResponseVO，封装一个返回更新值1

- /index

	- 主页

		- 返回到gd/AskLeaveIndex页面

- /find

	- 分页查询请假信息

		- 参数：Page<AskLeaveVO> svp,AskLeaveVO sv
		- 输出：IPage<AskLeaveVO>

- /delete

	- 批量删除

		- delete  参数：List<AskLeaveVO> askLeaveList
		- 输出：void

- /info

	- 查看

		- get  参数：AskLeaveVO askLeave
		- 输出：AskLeaveVO

- /update

	- 更新

		- put  参数：AskLeaveVO askleaveVO
		- 输出void

- /insert

	- 插入

		- post 参数：AskLeaveVO askleaveVO
		- 输出：void

### 请假类型接口/gd/askleavetype

- /index

	- 主页

		- 返回到gd/AskLeaveTypeIndex页面

- /find

	- 分页查询请假类型信息

		- 参数：Page<AskLeaveTypeVO> svp,AskLeaveTypeVO sv
		- 输出：IPage<AskLeaveTypeVO>

- /delete

	- 批量删除

		- delete  参数：List<AskLeaveTypeVO> askLeaveTypeList
		- 输出：void

- /info

	- 查看

		- get  参数：AskLeaveTypeVO askLeaveType
		- 输出：AskLeaveTypeVO

- /update

	- 更新

		- put  参数：AskLeaveTypeVO askleavetypeVO
		- 输出void

- /insert

	- 插入

		- post 参数：AskLeaveTypeVO askleavetypeVO
		- 输出：void

- /findAll

	- 查询所有

		- 输出ResponseVO，封装的list数据是返回的实体对象。

