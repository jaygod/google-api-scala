package google.language

import com.google.api.services.admin.{directory => jDirectory}
import com.google.api.services.{calendar => jCalendar, drive => jDrive}
import google.language.JavaConversions._
import google.services.admin.{directory => sDirectory}
import google.services.{calendar => sCalendar, drive => sDrive}

import scala.language.{implicitConversions, postfixOps}

/**
  * Created by davenpcm on 5/7/16.
  */
object JavaConverters {

  class AsJava[C](op: => C){
    def asJava: C = op
  }

  class AsScala[C](op: => C){
    def asScala: C = op
  }

  class AsGoogle[C](op: => C){
    def asGoogle: C = op
  }

  implicit def scalaDirectoryAsJavaDirectoryConverter(b: sDirectory.Directory): AsJava[jDirectory.Directory] = {
    new AsJava(scalaDirectoryAsJavaDirectoryConversion(b))
  }

  implicit def scalaGroupAsJavaGroupConverter(b: sDirectory.models.Group): AsJava[jDirectory.model.Group] = {
    new AsJava(scalaGroupAsJavaGroupConversion(b))
  }

  implicit def javaGroupAsScalaGroupConverter(b: jDirectory.model.Group): AsScala[sDirectory.models.Group] = {
    new AsScala(javaGroupAsScalaGroupConversion(b))
  }

  implicit def scalaGroupsAsJavaGroupsConverter(b: sDirectory.models.Groups): AsJava[jDirectory.model.Groups] = {
    new AsJava(scalaGroupsAsJavaGroupsConversion(b))
  }

  implicit def javaGroupsAsScalaGroupsConverter(b: jDirectory.model.Groups): AsScala[sDirectory.models.Groups] = {
    new AsScala(javaGroupsAsScalaGroupsConversion(b))
  }

  implicit def scalaMemberAsJavaMemberConverter(b: sDirectory.models.Member): AsJava[jDirectory.model.Member] = {
    new AsJava(scalaMemberAsJavaMemberConversion(b))
  }

  implicit def javaMemberAsScalaMemberConverter(b: jDirectory.model.Member): AsScala[sDirectory.models.Member] = {
    new AsScala(javaMemberAsScalaMemberConversion(b))
  }

  implicit def scalaListMemberAsJavaMembersConverter(b: sDirectory.models.Members)
  : AsJava[jDirectory.model.Members] = {
    new AsJava(scalaMembersAsJavaMembersConversion(b))
  }

  implicit def javaMembersAsScalaListMemberConverter(b: jDirectory.model.Members):
  AsScala[sDirectory.models.Members] = {
    new AsScala(javaMembersAsScalaMembersConversion(b))
  }

  implicit def scalaUserAsJavaUserConverter(b: sDirectory.models.User): AsJava[jDirectory.model.User] = {
    new AsJava(scalaUserAsJavaUserConversion(b))
  }

  implicit def javaUserAsScalaUserConverter(b: jDirectory.model.User): AsScala[sDirectory.models.User] = {
    new AsScala(javaUserAsScalaUserConversion(b))
  }

  implicit def scalaUsersAsJavaUsersConverter(b: sDirectory.models.Users): AsJava[jDirectory.model.Users] = {
    new AsJava(scalaUsersAsJavaUsersConversion(b))
  }

  implicit def javaUsersAsScalaListUserConverter(b: jDirectory.model.Users): AsScala[sDirectory.models.Users] = {
    new AsScala(javaUsersAsScalaUsersConversion(b))
  }

  implicit def scalaNameAsJavaUserNameConverter(b: sDirectory.models.Name): AsJava[jDirectory.model.UserName] = {
    new AsJava(scalaNameAsJavaUserNameConversion(b))
  }

  implicit def javaUserNameAsScalaNameConverter(b: jDirectory.model.UserName): AsScala[sDirectory.models.Name] = {
    new AsScala(javaUserNameAsScalaNameConversion(b))
  }

  implicit def scalaEmailAsJavaUserEmailConverter(b: sDirectory.models.Email): AsJava[jDirectory.model.UserEmail] = {
    new AsJava(scalaEmailAsJavaUserEmailConversion(b))
  }

  implicit def javaUserEmailAsScalaEmailConverter(b: jDirectory.model.UserEmail): AsScala[sDirectory.models.Email] = {
    new AsScala(javaUserEmailAsScalaEmailConversion(b))
  }

  implicit def scalaDriveAsJavaDriveConverter(b: sDrive.Drive): AsJava[jDrive.Drive] = {
    new AsJava(scalaDriveAsJavaDriveConversion(b))
  }

  implicit def scalaFileAsJavaFileConverter(b: sDrive.models.File): AsJava[jDrive.model.File] = {
    new AsJava(scalaFileAsJavaFileConversion(b))
  }

  implicit def javaFileAsScalaFileConverter(b: jDrive.model.File): AsScala[sDrive.models.File] = {
    new AsScala(javaFileAsScalaFileConversion(b))
  }

  implicit def scalaListFileAsJavaFileListConverter(b: List[sDrive.models.File]): AsJava[jDrive.model.FileList] = {
    new AsJava(scalaListFileAsJavaFileListConversion(b))
  }

  implicit def javaFileListAsScalaListFileConverter(b: jDrive.model.FileList): AsScala[List[sDrive.models.File]] = {
    new AsScala(javaFileListAsScalaListFileConversion(b))
  }

  implicit def scalaFileContentAsJavaFileContentConverter(b: sDrive.models.FileContent)
  : AsJava[com.google.api.client.http.FileContent] = {
    new AsJava(scalaFileContentAsJavaFileContentConversion(b))
  }

  implicit def scalaPermissionAsJavaPermissionConverter(b: sDrive.models.Permission):AsJava[jDrive.model.Permission] ={
    new AsJava(scalaPermissionAsJavaPermissionConversion(b))
  }

  implicit def javaPermissionAsScalaPermissionConverter(b: jDrive.model.Permission):AsScala[sDrive.models.Permission] ={
    new AsScala(javaPermissionAsScalaPermissionConversion(b))
  }

  implicit def scalaListPermissionAsJavaPermissionsListConverter(b: List[sDrive.models.Permission])
  : AsJava[jDrive.model.PermissionList] = {
    new AsJava(scalaListPermissionAsJavaPermissionsListConversion(b))
  }

  implicit def javaPermissionsListAsScalaListPermissionConverter(b: jDrive.model.PermissionList)
  : AsScala[List[sDrive.models.Permission]] = {
    new AsScala(javaPermissionsListAsScalaListPermissionsConversion(b))
  }

  implicit def scalaCalendarAsJavaCalendarConverter(b: sCalendar.Calendar): AsJava[jCalendar.Calendar] = {
    new AsJava(scalaCalendarAsJavaCalendarConversion(b))
  }

  implicit def scalaEventAsJavaEventConverter(b: sCalendar.models.Event): AsJava[jCalendar.model.Event] = {
    new AsJava(scalaEventAsJavaEventConversion(b))
  }

  implicit def javaEventAsScalaEventConverter(b: jCalendar.model.Event): AsScala[sCalendar.models.Event] = {
    new AsScala(javaEventAsScalaEventConversion(b))
  }

  implicit def javaZonedDateTimeAsGoogleDateTimeConverter(b: java.time.ZonedDateTime)
  : AsGoogle[com.google.api.client.util.DateTime] = {
    new AsGoogle(javaZonedDateTimeAsGoogleDateTimeConversion(b))
  }

  implicit def googleDateTimeAsJavaZonedDateTimeConverter(b: com.google.api.client.util.DateTime)
  : AsJava[java.time.ZonedDateTime] = {
    new AsJava(googleDateTimeAsJavaZoneDateTimeConversion(b))
  }

//  implicit def javaZoneDateTimeAsGoogleEventDateTimeConverter(b: java.time.ZonedDateTime)
//  : AsGoogle[jCalendar.model.EventDateTime] = {
//    new AsGoogle(javaZonedDateTimeAsGoogleEventDateTimeConversion(b))
//  }

//  implicit def googleEventDateTimeAsJavaZonedDateTimeConverter(b: jCalendar.model.EventDateTime)
//  : AsJava[java.time.ZonedDateTime] = {
//    new AsJava(googleEventDateTimeAsJavaZonedDateTimeConversion(b))
//  }


}
