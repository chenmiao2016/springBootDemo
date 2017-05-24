FROM reg.dhdc.com/chenmiao/centos:6.6
MAINTAINER chen_miao 510473319@qq.com

ENV LANG en_US.UTF-8
ENV LC_ALL en_US.UTF-8

ENTRYPOINT ["/bin/sh","-c","/etc/rc.d/rc.local;/usr/sbin/sshd -D"]

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime; \
  mkdir -p /etc/yum.repos.d/bak; \
  mv /etc/yum.repos.d/CentOS-* /etc/yum.repos.d/bak; \
  echo "#!/bin/bash" > /etc/rc.d/rc.local; \
  echo "nohup /usr/bin/java -jar /opt/*.war > /opt/nohup.out 2>&1 &" >> /etc/rc.d/rc.local;

ADD http://10.35.49.20/centos/myrepo/CentOS-Local6.repo /etc/yum.repos.d

ADD dhcAPI-0.0.1.war /opt

RUN yum install -y which java-1.8.0-openjdk-devel openssh-server openssh-clients || echo "ok"; \
  rm -rf /var/lib/yum/history/*.sqlite;rm /var/lib/rpm/__db* -rf;rpm --rebuilddb;yum clean all; \
  rm -rf /tmp/*;

EXPOSE 8080