/*
 * YouTube History Downloader :: Download your full YouTube watch history
 * Copyright (c) 2019-2020 Vaclav Svejcar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.vaclavsvejcar.yhd.domain

case class ReportData(videos: Seq[VideoRef], uniqueNo: Int)

object ReportData {
  def from(videos: Seq[VideoRef]): ReportData = ReportData(videos, videos.distinct.size)
}
