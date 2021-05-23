import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaProcesodecompra extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <label>Resumen de la compra</label>
 <vaadin-horizontal-layout theme="spacing" style="width: 30%;">
  <label style="width: 100%;">Total Productos</label>
  <label id="nProductos" style="border:solid;border-width: 1px; flex-grow: 0;">Label</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 30%;">
  <label style="width: 100%;">Precio</label>
  <label id="Precio" style="border:solid;border-width: 1px; flex-grow: 0;">Label</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 30%;">
  <label style="width: 100%;">Precio gastis de envio</label>
  <label id="PrecioGastosEnvio" style="border:solid;border-width: 1px; flex-grow: 0;">Label</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 30%;">
  <label style="width: 100%;">Total</label>
  <label id="total" style="border:solid;border-width: 1px; flex-grow: 0;">Label</label>
 </vaadin-horizontal-layout>
 <vaadin-button theme="primary" id="btnCambiarDatosCompra" style="align-self: center;">
  Cambiar datos de compra
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button theme="primary" id="btnCancelar">
   Cancelar
  </vaadin-button>
  <vaadin-button theme="primary" id="btnRealizarCompra">
   Realizar Compra
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-procesodecompra';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProcesodecompra.is, VistaProcesodecompra);
