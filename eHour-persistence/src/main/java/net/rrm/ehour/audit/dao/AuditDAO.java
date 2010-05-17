/*
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package net.rrm.ehour.audit.dao;

import java.util.List;

import net.rrm.ehour.dao.GenericDao;
import net.rrm.ehour.domain.Audit;

public interface AuditDAO extends GenericDao<Audit, Number>
{
	/**
	 * 
	 * @param request
	 * @return
	 */
	public List<Audit> findAudit(AuditReportRequest request);
	
	public List<Audit> findAuditAll(AuditReportRequest request);
	
	/**
	 * 
	 * @param request
	 * @return
	 */
	public Number findAuditCount(AuditReportRequest request);
}