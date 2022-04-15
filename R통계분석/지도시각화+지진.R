library(ggmap)
register_google(key = "AIzaSyDoF_ZIWB5VhuifKAv99Xek5bDfugkLlOc")
map=get_googlemap(center=c(126.975684,37.572752),maptype = "roadmap",zoom=17,size=c(320,320))
ggmap(map,extent="device")

gc=geocode(enc2utf8("숭례문"))
gc
lonlat=c(gc$lon,gc$lat)
map=get_googlemap(center=lonlat,maptype="roadmap",zoom=15,marker=gc)
ggmap(map)
  



#지도에 지진 표시 
library(openxlsx)
library(ggplot2)
df=read.xlsx(file.choose(),sheet=1,startRow=4)
df
df[,6]=gsub("N","",df[,6])
df[,7]=gsub("E","",df[,7])
df2=data.frame(lon=df[,7],lat=df[,6],mag=df[,3])

df2[,1]=as.numeric(df2[,1])
df2[,2]=as.numeric(df2[,2])

str(df)


cen=c((max(df2$lon)+min(df2$lon))/2,
      (max(df2$lat)+min(df2$lat))/2)

cen
map=get_googlemap(center = cen,zoom=6)
gmap=ggmap(map)
gmap+geom_point(data=df2,aes(x=lon,y=lat),color="red",size=df2$mag,alpha=0.2)
