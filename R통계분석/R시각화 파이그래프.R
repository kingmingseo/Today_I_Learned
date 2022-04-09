T_sales=c(210,110,400,550,700,130)
pie(T_sales, init.angle=90, col=rainbow(length(T_sales)),main="주간매출변동",labels=c("M","T","W","TH","F","SA"))
legend(1,1,c("M","T","W","TH","F","SA"),cex=0.8,fill=rainbow(length(T_sales)))

#파이차트는 원점을 기준으로 legend좌표 설정


#파이차트 3D로 그리기 
library("plotrix")
week=c("M","T","W","TH","F","SA")
ratio=round(T_sales/sum(T_sales)*100,1)
label=paste(week,"\n",ratio,"%")
pie3D(T_sales,main="주간매출동향",col=rainbow(length(T_sales)),cex=0.8, labels=label)
legend(-0.8,1,c("M","T","W","TH","F","SA"),cex=0.5,fill=rainbow(length(T_sales)))
dev.off()
pie3D(T_sales,main="주간매출동향",col=rainbow(length(T_sales)),cex=0.8, labels=label,explode=1)

rm(list=ls())

