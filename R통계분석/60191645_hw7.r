library(ggmap)
library(openxlsx)
library(ggplot2)
register_google(key = "AIzaSyDoF_ZIWB5VhuifKAv99Xek5bDfugkLlOc")

df=read.xlsx(file.choose(),sheet=1,startRow=2)
View(df)

gc=geocode(enc2utf8(c("서울","부산","대구","인천","광주","대전","울산","경기","강원","충북","충남","전북","전남","경북","경남","제주시")))
df2=t(df)
PM=as.numeric(df2[2:17,2])
df3=data.frame(city=df2[2:17,1],PM=PM,lon=gc$lon,lat=gc$lat)


ggplot(data=df3,aes(x=reorder(city,-PM),y=PM, fill=city))+geom_col()+xlab("city")


cen=c((max(gc$lon)+min(gc$lon))/2,
      (max(gc$lat)+min(gc$lat))/2)

map=get_googlemap(center = cen,zoom=6)
gmap=ggmap(map)
gmap+geom_point(data=df3,aes(x=lon,y=lat),color="red",size=df3$PM,alpha=0.2)
