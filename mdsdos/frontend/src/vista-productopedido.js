import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

class VistaProductopedido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }

		    #lateral :nth-child(1n) {
			  width: 100%;
			}
#lateral :nth-child(2n) {
			  width: 100%;
			}
#lateral :nth-child(3n) {
			  width: 100%;
			}
#lateral :nth-child(4n) {
			  width: 100%;
			}
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; border:solid; border-width:1px; padding: var(--lumo-space-xl); justify-content: flex-start;background-color:#232f3e" theme="spacing">
 <vaadin-horizontal-layout style="margin: var(--lumo-space-m); justify-content: center;color:white">
  <vaadin-vertical-layout style="width: 15%; flex-grow: 0; flex-shrink: 1;" id="lateral"></vaadin-vertical-layout>
  <img id="imgProducto" style="align-self: center; flex-grow: 0; flex-shrink: 0; margin: var(--lumo-space-m); height: 90%;" src="https://www.ikea.com/mx/es/images/products/urskog-cojin-leon-gris__0552849_pe659099_s5.jpg?f=xs">
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="height: 100%; align-self: center; justify-content: center; align-items: flex-start; margin-right: var(--lumo-space-m);">
  <label id="nombreProductoLbl" style="width: 100%; align-self: center;font-weight:bold;color:white">producto</label>
  <label id="descripProducLbl" style="width: 100%; align-self: center;color:white">descripcion </label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center;">
  <label id="precioUnidadLbl" style="color:white">precio</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 25%; height: 100%; justify-content: center; align-self: center;">
  <vaadin-button id="comentarBtn" style="align-self: flex-end;color:white;background-color:#374453">
    Comentar 
  </vaadin-button>
  <vaadin-button id="deleteBtn" style="align-self: flex-end;color:white;background-color:#374453">
    Eliminar 
  </vaadin-button>
  <vaadin-vertical-layout style="align-self: flex-end;text-aling:rigth;background-color:#6e839e">
   <vaadin-combo-box id="vaadinComboBox" style="align-self: flex-end;text-aling:rigth">
     1 
   </vaadin-combo-box>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="justify-content: center;">
  <label id="precioEurosLbl" style="width: 100%;color:white"></label>
  <label id="unidadesLbl" style="width: 100%;color:white">cantidad </label>
  <label id="valoracionLbl" style="width: 100%;color:white"></label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-productopedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductopedido.is, VistaProductopedido);
