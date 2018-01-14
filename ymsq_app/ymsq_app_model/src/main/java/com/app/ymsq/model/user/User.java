package com.app.ymsq.model.user;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 会员id
     */
    private String userId;

    /**
     * 会员上级id
     */
    private String superiorUserId;

    /**
     * 会员姓名
     */
    private String name;

    /**
     * 会员昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    /**
     * 注册会员绑定手机
     */
    private String mobile;

    /**
     * 注册会员邮箱地址
     */
    private String email;

    /**
     * 会员绑定账号类型:A支付宝，W微信，U银联
     */
    private String payType;

    /**
     * 会员绑定账号号码
     */
    private String payNumber;

    /**
     * 会员注册时间
     */
    private Date registerTime;

    /**
     * 住址
     */
    private String address;

    /**
     * 身份证
     */
    private String idcard;

    /**
     * 性别
     */
    private String sex;

    /**
     * 用户年龄
     */
    private String age;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 注册会员所属国籍
     */
    private String country;

    /**
     * 省份
     */
    private String province;

    /**
     * 街道
     */
    private String street;

    /**
     * 区域
     */
    private String area;

    /**
     * 城市
     */
    private String city;

    /**
     * 小区
     */
    private String community;

    /**
     * 单元
     */
    private String unit;

    /**
     * 楼栋
     */
    private String building;

    /**
     * 楼层
     */
    private String floor;

    /**
     * 门牌号
     */
    private String houseNumber;

    /**
     * 注册会员所属大学名称
     */
    private String universityName;

    /**
     * 注册会员所属大学系
     */
    private String facultyName;

    /**
     * 注册会员所属大学年级
     */
    private String grade;

    /**
     * 注册会员所属大学班
     */
    private String className;

    /**
     * 会员注册时间
     */
    private Date regTime;

    /**
     * 拓展级别
     */
    private String expandRank;

    /**
     * 拓展级别收益比
     */
    private String benefitRatio;

    /**
     * 拓展级别升级状态
     */
    private String rankStatus;

    /**
     * 会员身份身份状态
     */
    private String identityStatus;

    /**
     * 用户头像保存路径
     */
    private String faceUrl;

    /**
     * 上次登录时间
     */
    private Date loginTime;

    /**
     * 盐值
     */
    private String salt;
    
    /**
     * 短信验证码
     */
    private String code;
    
    /**
     * 短信id
     */
    private Integer smsId;
    
    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getSmsId() {
		return smsId;
	}

	public void setSmsId(Integer smsId) {
		this.smsId = smsId;
	}

	private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getSuperiorUserId() {
        return superiorUserId;
    }

    public void setSuperiorUserId(String superiorUserId) {
        this.superiorUserId = superiorUserId == null ? null : superiorUserId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(String payNumber) {
        this.payNumber = payNumber == null ? null : payNumber.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community == null ? null : community.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building == null ? null : building.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber == null ? null : houseNumber.trim();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName == null ? null : universityName.trim();
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName == null ? null : facultyName.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getExpandRank() {
        return expandRank;
    }

    public void setExpandRank(String expandRank) {
        this.expandRank = expandRank == null ? null : expandRank.trim();
    }

    public String getBenefitRatio() {
        return benefitRatio;
    }

    public void setBenefitRatio(String benefitRatio) {
        this.benefitRatio = benefitRatio == null ? null : benefitRatio.trim();
    }

    public String getRankStatus() {
        return rankStatus;
    }

    public void setRankStatus(String rankStatus) {
        this.rankStatus = rankStatus == null ? null : rankStatus.trim();
    }

    public String getIdentityStatus() {
        return identityStatus;
    }

    public void setIdentityStatus(String identityStatus) {
        this.identityStatus = identityStatus == null ? null : identityStatus.trim();
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl == null ? null : faceUrl.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", superiorUserId=").append(superiorUserId);
        sb.append(", name=").append(name);
        sb.append(", nickname=").append(nickname);
        sb.append(", password=").append(password);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", payType=").append(payType);
        sb.append(", payNumber=").append(payNumber);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", address=").append(address);
        sb.append(", idcard=").append(idcard);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", birthday=").append(birthday);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", street=").append(street);
        sb.append(", area=").append(area);
        sb.append(", city=").append(city);
        sb.append(", community=").append(community);
        sb.append(", unit=").append(unit);
        sb.append(", building=").append(building);
        sb.append(", floor=").append(floor);
        sb.append(", houseNumber=").append(houseNumber);
        sb.append(", universityName=").append(universityName);
        sb.append(", facultyName=").append(facultyName);
        sb.append(", grade=").append(grade);
        sb.append(", className=").append(className);
        sb.append(", regTime=").append(regTime);
        sb.append(", expandRank=").append(expandRank);
        sb.append(", benefitRatio=").append(benefitRatio);
        sb.append(", rankStatus=").append(rankStatus);
        sb.append(", identityStatus=").append(identityStatus);
        sb.append(", faceUrl=").append(faceUrl);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", salt=").append(salt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}