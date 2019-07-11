/**
 */
package metamodel.impl;

import metamodel.Box;
import metamodel.CompositeBox;
import metamodel.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel.impl.CompositeBoxImpl#getBoxes <em>Boxes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeBoxImpl extends BoxImpl implements CompositeBox {
	/**
	 * The cached value of the '{@link #getBoxes() <em>Boxes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxes()
	 * @generated
	 * @ordered
	 */
	protected Box boxes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.COMPOSITE_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box getBoxes() {
		if (boxes != null && boxes.eIsProxy()) {
			InternalEObject oldBoxes = (InternalEObject) boxes;
			boxes = (Box) eResolveProxy(oldBoxes);
			if (boxes != oldBoxes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.COMPOSITE_BOX__BOXES,
							oldBoxes, boxes));
			}
		}
		return boxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box basicGetBoxes() {
		return boxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxes(Box newBoxes) {
		Box oldBoxes = boxes;
		boxes = newBoxes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.COMPOSITE_BOX__BOXES, oldBoxes,
					boxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.COMPOSITE_BOX__BOXES:
			if (resolve)
				return getBoxes();
			return basicGetBoxes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.COMPOSITE_BOX__BOXES:
			setBoxes((Box) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetamodelPackage.COMPOSITE_BOX__BOXES:
			setBoxes((Box) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetamodelPackage.COMPOSITE_BOX__BOXES:
			return boxes != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeBoxImpl
