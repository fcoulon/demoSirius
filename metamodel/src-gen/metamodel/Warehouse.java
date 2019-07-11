/**
 */
package metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warehouse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.Warehouse#getBoxes <em>Boxes</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getWarehouse()
 * @model
 * @generated
 */
public interface Warehouse extends EObject {
	/**
	 * Returns the value of the '<em><b>Boxes</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Box}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boxes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boxes</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getWarehouse_Boxes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Box> getBoxes();

} // Warehouse
